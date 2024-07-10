package com.luv2code.junitdemo;

import org.junit.jupiter.api.*;

import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class DemoUtilTest {

    DemoUtils demoUtils;

    @BeforeEach
    void setupBeforeEach() {
        demoUtils = new DemoUtils();
        System.out.println("@BeforeEach executes before the execution of each test Method");
    }

    @AfterEach
    void tearDownAfterEach() {
        System.out.println("Running @AfterEach\n");
    }

    @BeforeAll
    static void setupBeforeEachAllMethods() {
        System.out.println("@BeforeAll executes only before all test methods.");
    }

    @AfterAll
    static void tearDownAfterAllMethods() {
        System.out.println("@AfterAll executes only once after all test methods");
    }

    @Test
    @DisplayName("Equals and Not Equals")
    void test_Equal_And_Not_Equals() {

        System.out.println("Running test: testEqualAndNotEquals");

        assertEquals(6, demoUtils.add( 2, 4), "2 + 4 must be 6");
        assertNotEquals(6, demoUtils.add(1, 9), "1 + 9 must not be 6");

    }

    @Test
    @DisplayName("Null and Not Null")
    void test_Null_And_Not_Null() {

        System.out.println("Running test: testNullAndNotNull");

        String str1 = null;
        String str2 = "Junit Tests";

        assertNull(demoUtils.checkNull(str1), "Object should be null");
        assertNotNull(demoUtils.checkNull(str2), "Object should not be null");

    }

    @Test
    @DisplayName("Same and Not Same")
    void testSameAndNotSame() {
        String str = "love2code";

        assertSame(demoUtils.getAcademy(), demoUtils.getAcademyDuplicate(), "Object should refer to the same Object");
        assertNotSame(str, demoUtils.getAcademy(), "Object should not refer to the same Object");

    }

    @Test
    @DisplayName("True and False")
    void testTrueAndFalse() {

        int gradeOne = 10;
        int gradeTwo = 5;

        assertTrue(demoUtils.isGreater(gradeOne, gradeTwo), "gradeOne should be greater than gradeTwo");
        assertFalse(demoUtils.isGreater(gradeTwo, gradeOne), "gradeTwo should not be greater than gradeOne");
    }

    @Test
    @DisplayName("Array Equals")
    void testArrayEquals() {
        String[] stringArray = {"A", "B", "C"};

        assertArrayEquals(stringArray, demoUtils.getFirstThreeLettersOfAlphabet(), "Arrays should be the same");
    }

    @Test
    @DisplayName("Test Iterable Equals")
    void testIterableEquals() {
        List<String> theList = List.of("luv", "2", "code");

        assertIterableEquals(theList, demoUtils.getAcademyInList(), "Expected list should be same as actual list");
    }

    @Test
    @DisplayName("Lines Match")
    void testLinesMatch() {
        List<String> theList = List.of("luv", "2", "code");

        assertLinesMatch(theList, demoUtils.getAcademyInList(), "Lines should be the same");
    }

    @Test
    @DisplayName("Throws and Does Not Throws")
    void testThrowsAndDoesNotThrow() {
        assertThrows(Exception.class, () -> { demoUtils.throwException(-1); }, "Should throw Exception");
        assertDoesNotThrow(() -> { demoUtils.throwException(5); }, "Should throw Exception");
    }

    @Test
    @DisplayName("Timeout")
    void testTimeout() {
        assertTimeoutPreemptively(Duration.ofSeconds(3), () -> { demoUtils.checkTimeout(); }, "Method should be execute in 3 seconds" );
    }

}
