package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SleepRhythmTest {

    @Test
    void KeuzesSlaapritme() {

        assertFalse(SleepRhythm.KeuzesSlaapritme().isEmpty());
    }
}
