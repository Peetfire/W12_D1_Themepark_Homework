package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor1, visitor2, visitor3, visitor4;

    @Before
    public void setUp() {

        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor1 = new Visitor(21, 1.8, 20.0);
        visitor2 = new Visitor(12, 1.45, 20.0);
        visitor3 = new Visitor(11, 1.8, 20.0);
        visitor4 = new Visitor(14, 1.1, 20.0);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void canRideOverHeightAndAge(){
        assertTrue(rollerCoaster.isAllowedTo(visitor1));
    }

    @Test
    public void canRideExactHeightAndAge(){
        assertTrue(rollerCoaster.isAllowedTo(visitor2));
    }

    @Test
    public void canNotRideOverHeightUnderAge(){
        assertFalse(rollerCoaster.isAllowedTo(visitor3));
    }

    @Test
    public void canNotRideOverAgeUnderHeight(){
        assertFalse(rollerCoaster.isAllowedTo(visitor3));
    }
}
