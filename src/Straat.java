public class Straat {

    private String straatnaam;
    private int nummer;
    private String toevoeging;

    public Straat (String straatnaam, int nummer, String toevoeging) {
        this.straatnaam = straatnaam;
        this.nummer = nummer;
        this.toevoeging = toevoeging;
    }

    public String toString () {
        return straatnaam + " " + nummer + (toevoeging.equals ("") ? "" : " " + toevoeging);
    }
}