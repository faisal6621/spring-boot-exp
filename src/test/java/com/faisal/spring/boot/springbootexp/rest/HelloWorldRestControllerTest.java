package com.faisal.spring.boot.springbootexp.rest;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloWorldRestControllerTest {

    @BeforeEach
    void setUp() throws Exception {
        System.out.println("setting up");
    }

    @AfterEach
    void tearDown() throws Exception {
        System.out.println("tearing down");
    }

    @Disabled
    @Test
    void test() {
        fail("Not yet implemented");
    }

}
