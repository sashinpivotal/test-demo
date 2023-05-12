package com.perscholas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidationTest {

    @Test
    void isValid_should_check_the_validity_of_user_name() {
        Boolean result = Validation.isValid("sang");
        Assertions.assertEquals(true, result);
    }

    @Test
    void isValid_should_return_false_given_invalid_name() {
        Boolean result = Validation.isValid("sang!");
        Assertions.assertEquals(false, result);
    }
}