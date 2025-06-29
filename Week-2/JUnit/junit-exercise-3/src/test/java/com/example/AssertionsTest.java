package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionsTest {

    @Test
    public void testVariousAssertions() {
        // assertEquals
        assertEquals(10, 5 + 5);

        // assertTrue
        assertTrue("Check if condition is true", 8 > 3);

        // assertFalse
        assertFalse("Check if condition is false", 2 > 10);

        // assertNull
        Object data = null;
        assertNull("Should be null", data);

        // assertNotNull
        String str = "JUnit";
        assertNotNull("Should not be null", str);
    }
}
