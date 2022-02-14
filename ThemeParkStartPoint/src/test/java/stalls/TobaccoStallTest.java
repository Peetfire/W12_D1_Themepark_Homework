package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor visitor1, visitor2, visitor3;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1);
        visitor1 = new Visitor(21, 1.5, 20.0);
        visitor2 = new Visitor(18, 1.5, 20.0);
        visitor3 = new Visitor(14, 1.5, 20.0);
    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void canPurchaseOverAge(){
        assertTrue(tobaccoStall.isAllowedTo(visitor1));
    }

    @Test
    public void canPurchaseMinAge(){
        assertTrue(tobaccoStall.isAllowedTo(visitor2));
    }

    @Test
    public void canNotPurchaseUnderAge(){
        assertFalse(tobaccoStall.isAllowedTo(visitor3));
    }
}
