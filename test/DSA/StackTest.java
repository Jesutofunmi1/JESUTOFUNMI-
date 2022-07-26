package DSA;

import DSA.HashStack;
import DSA.Stack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class StackTest {
Stack myStack;

    @BeforeEach
    void setUp() {

    }
    @Test
    @DisplayName("To test that stack is empty")
    void testEmptyStack() {
        assertTrue(myStack.isEmpty());
    }
}
