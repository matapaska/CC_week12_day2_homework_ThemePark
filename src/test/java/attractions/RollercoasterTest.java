package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor1 = new Visitor(14, 1.2, 40.0);
        visitor2 = new Visitor(14, 1.6, 40.0);

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
    public void checksIsAllowedTo(){
        assertEquals(false, rollerCoaster.isAllowedTo(visitor1));
    }

    @Test
    public void checksIsAllowedToFalse(){
        assertEquals(true, rollerCoaster.isAllowedTo(visitor2));
    }
}
