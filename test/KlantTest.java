import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class KlantTest {

    Werelddeel europa;

    @Before
    public void init () {
        europa = new Werelddeel("Europa");
        europa.addLand (new Land ("Nederland", "NL"));
        europa.addLand (new Land ("België", "BE"));
        europa.addLand (new Land ("Duitsland", "DE"));
    }

    @Test
    public void testBTWPercentages () {
        assertFalse (europa.landLigtInEuropa("CA"));
        assertTrue (europa.landLigtInEuropa("BE"));
    }
}