package ie.atu.shopping_cart;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void testGetName() {
        Item item = new Item("Iphone 10", 349.99,10);
        assertEquals("Iphone 10", item.getName(), "Item name should match");
    }

    @Test
    public void testGetPrice() {
        Item item = new Item("Ipad", 599.99,54);
        assertEquals(599.99, item.getPrice(), "Item price should match");
    }

    @Test
    public void testGetID(){
        Item item = new Item("Apple Watch",299.99,42);
        assertEquals(42,item.getID(), "Item ID should match" );
    }
}