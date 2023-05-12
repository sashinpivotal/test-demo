package com.perscholas;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ComputerTest {

    Computer computer;
    static int counter = 0;

    @BeforeAll
    static void beforeAll() {
        System.out.println("beforeAll: " + counter++);
    }

    @AfterAll
    static void afterAll() {
        System.out.println("afterAll" + counter++);
    }

    @BeforeEach
    void setUp() {
        System.out.println("setup: " + counter++);
        computer = new Computer();
    }

    @AfterEach
    void tearDown() {
        System.out.println("teardown");
    }

    @Test
    void add_method_should_return_added_value_given_two_int_numbers() {
        System.out.println("test1");
        int result = computer.add(2, 4);
        Assertions.assertEquals(6, result);
    }

    @Test
    void multiply_method_should_return_multiplied_value_given_two_int_numbers() {
        int result = computer.multiply(4, 5);
        Assertions.assertEquals(20, result);
    }

    // Write testing code for subtract method
    @DisplayName("parameterized test")
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({"0,    1,   1", "1,    2,   3",
            "49,  51, 100", "1,  100, 101"})
    void add(int first, int second, int expectedResult) {
        Computer calculator = new Computer();
        assertEquals(expectedResult, calculator.add(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }

}