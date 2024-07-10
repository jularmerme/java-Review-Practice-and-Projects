package com.luv2code.junitdemo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class ConditionalTest {

    @Test
    @EnabledIfEnvironmentVariable(named="HOME_ENV", matches="DEV")
    void testForEnvironmentVariable() {
        // Execute method and perform asserts
    }


    @Test
    @EnabledIfSystemProperty(named="HOME_SYS_PROP", matches="CI_CD_DEPLOY")
    void testForSystemProperty() {
        // Execute method and perform asserts
    }

}
