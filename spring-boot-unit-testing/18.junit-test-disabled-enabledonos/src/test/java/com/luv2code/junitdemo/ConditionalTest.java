package com.luv2code.junitdemo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

public class ConditionalTest {

    @Test
    @Disabled("Don't run until Jira #12 is resolved")
    void basicTest() {
        // Execute method and perform asserts
    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    void testForWindowsOnly() {
        // Execute method and perform asserts
    }

    @Test
    @EnabledOnOs(OS.LINUX)
    void testForLinuxOnly() {
        // Execute method and perform asserts
    }

    @Test
    @EnabledOnOs(OS.MAC)
    void testForMacOnly() {
        // Execute method and perform asserts
    }

    @Test
    @EnabledOnOs({OS.WINDOWS, OS.LINUX})
    void testForWindowsAndLinux() {
        // Execute method and perform asserts
    }

}
