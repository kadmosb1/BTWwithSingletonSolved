public class Factuur {

    private Klant klant;

    public Factuur (Klant klant) {
        this.klant = klant;
    }

    private String getKlantregels () {
        return String.format ("%s%n", klant);
    }

    private String getTitelregel () {
        return String.format ("Aantal Eenheid  Naam product%19s Prijs/st  Korting     Totaal%n", "");
    }

    private String getVerleggingsregel () {
        IBTWVerlegging verlegging = BTWVerleggingAdapter.getInstance ();
        return String.format ("%s", verlegging.getVerleggingsregel (klant.getBTWNummer()));
    }

    private String getFactuurregels () {
        return String.format ("    20 per stuk Product 1                       €    2,50       0%%  €   50,00%n" +
                              "     1 per 250  Product 2                       €   10,00       2%%  €    9,80%n" +
                              "  1000 per stuk Product 3                       €    0,22      52%%  €  106,70%n" +
                              "   2,6 kg       Product 4                       €    1,50      50%%  €    1,91%n");
    }

    private String getOptellingsregels () {
        return String.format ("                                                                    _________ +%n" +
                              "                                                          Subtotaal €  168,41%n");
    }

    public String toString () {

        IBTWVerlegging verlegging = BTWVerleggingAdapter.getInstance ();

        return  getKlantregels () +
                getTitelregel () +
                getVerleggingsregel () +
                getFactuurregels () +
                getOptellingsregels () +
                new BTWBerekening (verlegging, klant.getBTWNummer());
    }

    public void print () {
        System.out.println (this);
    }
}
