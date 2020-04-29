import org.junit.Test;

import static org.junit.Assert.*;

public class AdresTest {

    @Test
    public void testToString() throws Exception {
        Adres adres = new Adres (new Straat ("Lisserdijk", 413, ""),
                                 new Postcode (2165, "AE"), "LISSERBROEK");
        System.out.println (adres);
        String expected = String.format ("%s%n%s  %s%n", "Lisserdijk 413", "2165 AE", "LISSERBROEK");
        String actual = adres.toString();
        assertEquals (expected, actual);
    }
}