public class BTWVerleggingAdapter implements IBTWVerlegging {

    private static BTWVerleggingAdapter singleton;

    public static BTWVerleggingAdapter getInstance () {

        if (singleton == null) {
            singleton = new BTWVerleggingAdapter ();
        }

        return singleton;
    }

    private BTWVerleggingAdapter () { }

    private String getLandcode (String btwNummer) {
        return btwNummer.substring (0, 2);
    }

    @Override
    public boolean btwMoetWordenVerlegd(String btwNummer) {
        BTWVerlegging verlegging = BTWVerlegging.getInstance ();
        return verlegging.btwMoetWordenVerlegd (getLandcode (btwNummer));
    }

    @Override
    public String getVerleggingsregel(String btwNummer) {

        if (btwMoetWordenVerlegd (btwNummer)) {
            return String.format("%16sBTW wordt verlegd naar %s%n", "", btwNummer);
        }
        else {
            return "";
        }
    }
}
