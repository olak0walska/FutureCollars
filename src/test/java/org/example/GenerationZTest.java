package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenerationZTest {

    @Test
    void shouldReturnThatSomeoneIsFromGenerationZ() {
        boolean isSomeoneFromGenerationZ = GenerationZ.isSomeoneFromGenerationZ(2004);
        Assertions.assertTrue(isSomeoneFromGenerationZ);
    }

    @Test
    void shouldReturnThatSomeoneIsNotFromGenerationZ() {
        boolean isSomeoneFromGenerationZ = GenerationZ.isSomeoneFromGenerationZ(2022);
        Assertions.assertFalse(isSomeoneFromGenerationZ);
    }
}