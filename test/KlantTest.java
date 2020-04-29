import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class KlantTest {

    BTWVerlegging btwVerlegging;

    @Before
    public void init () {
        btwVerlegging = BTWVerlegging.getInstance ();
    }

    @Test
    public void testBTWPercentages () {
        assertFalse (btwVerlegging.btwMoetWordenVerlegd ("CA"));
        assertFalse (btwVerlegging.btwMoetWordenVerlegd ("NL"));
        assertTrue (btwVerlegging.btwMoetWordenVerlegd ("DE"));
    }
}