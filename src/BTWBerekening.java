public class BTWBerekening implements IBTWBerekening {

    String btwNummer;

    public BTWBerekening (IBTWVerlegging verlegging, String btwNummer) {
        this.btwNummer = btwNummer;
    }

    public String toString () {

        IBTWVerlegging verlegging = BTWVerleggingAdapter.getInstance ();

        if (verlegging.btwMoetWordenVerlegd (btwNummer)) {
            return "";
        }
        else {
            return String.format ("                                                          21%% BTW   €   35,37%n" +
                                  "                                                                    _________ +%n" +
                                  "                                                            Totaal  €  203,78%n");
        }
    }
}