package com.example;
//static import

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator cal = null;

    @Test
    @DisplayName("더하기 test")
    void plus() {
        assertEquals(5, cal.plus(2, 3));
    }

    @Test
    @DisplayName("빼기 test")
    void minus() {
        assertEquals(2, cal.minus(3, 1));
    }

    @BeforeAll
    static void beforeAll() {
        System.out.println("just one when test start");
    }

    @BeforeEach
    void beforeEach() {
        cal = new Calculator();
        System.out.println("run when each test start");
    }

    @AfterEach
    void afterEach() {
        cal = null;
        System.out.println("run when each test end");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("just one when test end");
    }
}
