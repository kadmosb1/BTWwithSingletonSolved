public class Adres {

    private Straat straatEnNummer;
    private Postcode postcode;
    private String woonplaats;

    public Adres (Straat straat, Postcode pc, String woonplaats) {
        this.straatEnNummer = straat;
        this.postcode = pc;
        this.woonplaats = woonplaats;
    }

    public String toString () {
        return String.format ("%s%n%s  %s%n", straatEnNummer, postcode, woonplaats);
    }
}
