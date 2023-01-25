import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AxeTest {

    Axe axe;

    @Before
    public void before() {
        axe = new Axe("axe", 3);
    }

    @Test
    public void hasName() {
        assertEquals("axe", axe.getName());
    }

    @Test
    public void hasDamagePoints() {
        assertEquals(3, axe.getDamagePoints());
    }

    @Test
    public void CanInflictDamage() {
        assertTrue(axe.InflictDamage());
    }
}
