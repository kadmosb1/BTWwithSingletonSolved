import java.util.ArrayList;

public class Werelddeel {

    private String naam;
    private ArrayList<Land> landen;

    public Werelddeel(String naam) {
        this.naam = naam;
        landen = new ArrayList<>();
    }

    public String getNaam () {
        return naam;
    }

    public void addLand(Land land) {
        landen.add(land);
    }

    public Land getLand(String landcode) {

        for (Land land : landen) {

            if (land.getLandcode ().equals (landcode)) {
                return land;
            }
        }

        return null;
    }

    public boolean landLigtInEuropa (String landcode) {

        if (this.getNaam().equals ("Europa")) {

            if (this.getLand (landcode) != null) {
                return true;
            }
        }

        return false;
    }
}