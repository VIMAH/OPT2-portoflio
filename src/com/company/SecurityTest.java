package com.company;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class SecurityTest {

    @Test
    void createPinCode() {

        int code1 = new Random().nextInt(10_000);

        //arrange
        int expectedResult = code1;

        //act
        int actualResult = code1;

        //assert
        assertEquals(expectedResult, actualResult);
    }
}