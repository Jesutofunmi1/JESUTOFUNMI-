package DSA;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class ListTest {

    List list;

    @BeforeEach
    void setUp() {
        list = new ArrayList(3);
    }
    @Test
    void testThatListIsEmpty() {
        assertTrue(list.isEmpty());
    }

    @Test
    void addItem_ListNotEmptyTest() {
        list.add("G-String");
        assertFalse(list.isEmpty());
    }

    @Test
    void addItem_andRemoveItemTest() {
        list.add("G-String");
        list.delete("G-String");
        assertTrue(list.isEmpty());
    }
}
