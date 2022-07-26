package DSA;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class ListTest {

    List list;

    @BeforeEach
    public void setUp() {
        list = new ArrayList();

    }
    @Test
    void testThatListIsEmpty() {
        assertTrue(list.isEmpty());
    }

    @Test
    void testThatItemsAreAddedToTheList() {
        list.addItem("iPhone");
        assertFalse(list.isEmpty());
        assertEquals(1,list.size());
    }
    @Test
    void testThatWeCanRemoveItem() {
        list.addItem("iPhone");
        list.addItem("Charger");
        list.addItem("airPod");
        assertEquals(3, list.size());
        list.removeItem("iPhone");
        assertEquals(2, list.size());
    }
    @Test
    void testThatItemsCanBeGotten() {
        list.addItem("iPhone");
        list.addItem("Charger");
        list.addItem("airPod");
        assertEquals("Charger", list.getIndex(1));

    }

}

