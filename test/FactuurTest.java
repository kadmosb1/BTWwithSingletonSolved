import org.junit.Test;

import static org.junit.Assert.*;

public class FactuurTest {

    private Factuur getFactuur (String btwNummer) throws Exception {
        Straat straat = new Straat ("Johanna Westerdijkplein", 75, "");
        Postcode postcode = new Postcode (2521, "EN");
        Adres adres = new Adres (straat, postcode, "DEN HAAG");
        Klant klant = new Klant ("De Haagse Hogeschool", adres, btwNummer);

        /*
         * Deze regel is de enige regel die in de test is veranderd.
         */
        IBTWVerlegging verlegging = BTWVerleggingAdapter.getInstance ();
        return new Factuur (klant, verlegging);
    }

    @Test
    public void testToStringMetVerlegging () throws Exception {

        Factuur factuur = getFactuur ("BE 8471964261");
        System.out.println (factuur);
        String expected = String.format ("De Haagse Hogeschool%n" +
                "Johanna Westerdijkplein 75%n" +
                "2521 EN  DEN HAAG%n" +
                "%n" +
                "Aantal Eenheid  Naam product                    Prijs/st  Korting     Totaal%n" +
                "                BTW wordt verlegd naar BE 8471964261%n" +
                "    20 per stuk Product 1                       €    2,50       0%%  €   50,00%n" +
                "     1 per 250  Product 2                       €   10,00       2%%  €    9,80%n" +
                "  1000 per stuk Product 3                       €    0,22      52%%  €  106,70%n" +
                "   2,6 kg       Product 4                       €    1,50      50%%  €    1,91%n" +
                "                                                                    _________ +%n" +
                "                                                          Subtotaal €  168,41%n");

        String actual = factuur.toString ();
        assertEquals(expected, actual);
    }

    @Test
    public void testToStringZonderVerlegging () throws Exception {

        Factuur factuur = getFactuur ("NL 8471964261");
        System.out.println (factuur);
        String expected = String.format ("De Haagse Hogeschool%n" +
                "Johanna Westerdijkplein 75%n" +
                "2521 EN  DEN HAAG%n%n" +
                "Aantal Eenheid  Naam product                    Prijs/st  Korting     Totaal%n" +
                "    20 per stuk Product 1                       €    2,50       0%%  €   50,00%n" +
                "     1 per 250  Product 2                       €   10,00       2%%  €    9,80%n" +
                "  1000 per stuk Product 3                       €    0,22      52%%  €  106,70%n" +
                "   2,6 kg       Product 4                       €    1,50      50%%  €    1,91%n" +
                "                                                                    _________ +%n" +
                "                                                          Subtotaal €  168,41%n" +
                "                                                          21%% BTW   €   35,37%n" +
                "                                                                    _________ +%n" +
                "                                                            Totaal  €  203,78%n");
        String actual = factuur.toString ();
        assertEquals(expected, actual);
    }
}