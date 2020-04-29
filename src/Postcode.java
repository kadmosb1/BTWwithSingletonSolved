public class Postcode {

    private int cijfers;
    private String letters;

    public Postcode (int cijfers, String letters) throws Exception {

        try {

            if ((cijfers > 999) && (cijfers < 10000)) {
                this.cijfers = cijfers;
            }
            else {
                throw new Exception ("Een postcode moet uit precies 4 cijfers bestaan");
            }

            if (letters.length () == 2) {
                this.letters = letters;
            }
            else {
                throw new Exception ("Een postcode moet uit precies 2 letters bestaan");
            }
        }
        catch (Exception e) {
            System.out.println ("LOG: " + e.getMessage());
            throw e;
        }
    }

    public String toString () {
        return cijfers + " " + letters;
    }
}
