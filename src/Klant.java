public class Klant {

    public String naam;
    public Adres adres;
    public String btwNummer;

    public Klant (String naam, Adres adres, String btwNummer) {
        this.naam = naam;
        this.adres = adres;
        this.btwNummer = btwNummer;
    }

    public String getBTWNummer () {
        return btwNummer;
    }

    public String toString () {
        return String.format ("%s%n%s", naam, adres);
    }
}
