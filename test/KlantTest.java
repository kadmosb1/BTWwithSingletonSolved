import org.junit.Test;

import static org.junit.Assert.*;

public class KlantTest {

    @Test
    public void testToString() throws Exception {

        Klant klant = new Klant ("De Haagse Hogeschool",
                                  new Adres (new Straat ("Johanna Westerdijkplein", 75, ""),
                                             new Postcode (2521, "EN"), "DEN HAAG"), "NL 8471964261");
        System.out.println (klant);
        String expected = String.format ("%s%n%s%n%s%n", "De Haagse Hogeschool", "Johanna Westerdijkplein 75", "2521 EN  DEN HAAG");
        String actual = klant.toString ();
        assertEquals (expected, actual);
    }
}