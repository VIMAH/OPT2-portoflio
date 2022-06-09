package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppointmentTest {

    @Test
    void notitie() {

        //arrange
        String expectedResult = "Boeken meenemen!";

        //act
        String actualResult = Appointment.Notitie();

        //assert
        assertEquals(expectedResult, actualResult);
    }
}