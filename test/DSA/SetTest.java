package DSA;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SetTest {
    Set mySet;

    @BeforeEach
    void setUp() {
        mySet = new Set();

    }

    @Test
    void testThat_Set_IsEmpty() {
        assertTrue(mySet.IsEmpty());
    }
    @Test
    void testThatWeCan_AddToSet() {
        mySet.add("Sea school");

        assertFalse(mySet.IsEmpty());
        assertEquals(1, mySet.size());
    }
}
