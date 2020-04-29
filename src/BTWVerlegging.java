import java.util.ArrayList;

public class BTWVerlegging {

    private class Land {

        private String naam;
        private String landcode;

        public Land (String naam, String landcode) {
            this.naam = naam;
            this.landcode = landcode;
        }

        public String getLandcode () {
            return landcode;
        }
    }

    private static BTWVerlegging singleton = null;
    private ArrayList<Land> verleggingslanden;

    private void addLand (Land land) {
        verleggingslanden.add(land);
    }

    private void voegVerleggingslandenToe () {
        // Normaal gesproken zou je deze data inlezen vanuit een database. Dat
        // wordt nu (omdat studenten nog geen kennis hoeven te hebben van het
        // lezen van data uit een database) in een statische lijst vastgelegd.
        addLand (new Land ("Frankrijk", "FR"));
        addLand (new Land ("Duitsland", "DE"));
        addLand (new Land ("België", "BE"));
    }

    private BTWVerlegging () {
        verleggingslanden = new ArrayList<> ();
        voegVerleggingslandenToe ();
    }

    public static BTWVerlegging getInstance () {

        if (singleton == null) {
            singleton = new BTWVerlegging ();
        }

        return singleton;
    }

    private Land getLand (String landcode) {

        for (Land land : verleggingslanden) {

            if (land.getLandcode ().equals (landcode)) {
                return land;
            }
        }

        return null;
    }

    public boolean btwMoetWordenVerlegd (String landcode) {
        return this.getLand(landcode) != null;
    }
}