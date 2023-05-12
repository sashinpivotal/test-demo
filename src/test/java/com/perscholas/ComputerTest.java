package com.perscholas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ComputerTest {

    @Test
    void add_method_should_return_added_value_given_two_int_numbers() {
        // when
        Computer computer = new Computer();

        //
        int result = computer.add(2, 4);
        Assertions.assertEquals(6, result);
    }

    @Test
    void multiply_method_should_return_multiplied_value_given_two_int_numbers() {
        Computer computer = new Computer();
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