package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class PlaygroundTest {
    Playground playground;
    Visitor visitor1, visitor2, visitor3;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
        visitor1 = new Visitor(16, 1.5, 20.0);
        visitor2 = new Visitor(15, 1.5, 20.0);
        visitor3 = new Visitor(14, 1.5, 20.0);
    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void canGetInUnderAge(){
        assertTrue(playground.isAllowedTo(visitor1));
    }

    @Test
    public void canGetInMaxAge(){
        assertTrue(playground.isAllowedTo(visitor2));
    }

    @Test
    public void canNotGetInOverAge(){
        assertFalse(playground.isAllowedTo(visitor3));
    }
}
