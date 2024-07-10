package com.luv2code.junitdemo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class ConditionalTest {

    @Test
    @EnabledOnJre(JRE.JAVA_17)
    void basicTestForJava17() {
        // Execute method and perform asserts
    }

    @Test
    @EnabledOnJre(JRE.JAVA_13)
    void testForJava13() {
        // Execute method and perform asserts
    }

    @Test
    @EnabledForJreRange(min=JRE.JAVA_13, max=JRE.JAVA_18)
    void testForJavaRange() {
        // Execute method and perform asserts
    }

    @Test
    @EnabledForJreRange(min=JRE.JAVA_15)
    void testForJavaRangeMin15() {
        // Execute method and perform asserts
    }

    @Test
    @EnabledForJreRange(max=JRE.JAVA_18)
    void testForJavaRangeMax18() {
        // Execute method and perform asserts
    }

    @Test
    @EnabledForJreRange(min=JRE.JAVA_13, max=JRE.OTHER)
    void testForJavaRangeMin13() {
        // Execute method and perform asserts
    }

}
