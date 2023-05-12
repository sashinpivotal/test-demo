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
    @DisplayName("Test add method")
    void add_method_should_return_added_value_given_two_int_numbers() {
        System.out.println("test1");
        int result = computer.add(2, 4);
        Assertions.assertEquals(6, result,
                "add test failed");
    }

    @Test
    @DisplayName("Test add method using AssertJ package")
    void add_method_should_return_added_value_given_two_int_numbers2() {
        int result = computer.add(2, 4);
        Assertions.assertEquals(6, result);  // assertion using JUnit 5 assertion package
        org.assertj.core.api.Assertions.assertThat(result).isEqualTo(6);
    }

    @Test
    void compare_equal_vs_same1() {
        Computer computer1 = new Computer("apple");
        Computer computer2 = new Computer("apple");
        Assertions.assertEquals(computer1, computer2);
    }

    @Test
    void use_assertTrue() {
        Assertions.assertTrue( 4> 2);
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