package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringTest {
    @Test
    @DisplayName("subString test")
    void subString() {
        String str = "abcdef";
        Assertions.assertEquals("cd", str.substring(2, 4));
    }
}
