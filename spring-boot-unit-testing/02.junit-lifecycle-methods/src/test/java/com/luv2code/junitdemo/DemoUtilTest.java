package com.luv2code.junitdemo;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.engine.support.descriptor.FileSystemSource;

import static org.junit.jupiter.api.Assertions.*;

public class DemoUtilTest {

    DemoUtils demoUtils;

    @BeforeEach
    void setupBeforeEach() {
        demoUtils = new DemoUtils();
        System.out.println("@BeforeEach executes before the execution of each test Method");
    }


    @Test
    void testEqualAndNotEquals() {

        System.out.println("Running test: testEqualAndNotEquals");

        assertEquals(6, demoUtils.add( 2, 4), "2 + 4 must be 6");
        assertNotEquals(6, demoUtils.add(1, 9), "1 + 9 must not be 6");

    }

    @Test
    void testNullAndNotNull() {

        System.out.println("Running test: testNullAndNotNull");

        String str1 = null;
        String str2 = "Junit Tests";

        assertNull(demoUtils.checkNull(str1), "Object should be null");
        assertNotNull(demoUtils.checkNull(str2), "Object should not be null");

    }

}
