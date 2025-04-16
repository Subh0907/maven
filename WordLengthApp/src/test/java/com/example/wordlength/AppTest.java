package com.example.wordlength;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testWordLength() {
        assertEquals(5, "Hello".length());
    }
}
