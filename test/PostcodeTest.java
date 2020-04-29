import org.junit.Test;

import static org.junit.Assert.*;

public class PostcodeTest {

    @Test
    public void testToString () throws Exception {
        Postcode postcode = new Postcode(2455, "AB");
        System.out.println (postcode);
        assertEquals ("2455 AB", postcode.toString());
    }

    @Test (expected = Exception.class)
    public void testExceptionTeWeinigCijfers () throws Exception {
        Postcode postcode = new Postcode (455, "AB");
    }

    @Test (expected = Exception.class)
    public void testExceptionTeVeelCijfers () throws Exception {
        Postcode postcode = new Postcode (45554, "AB");
    }

    @Test (expected = Exception.class)
    public void testExceptionTeVeelLetters () throws Exception {
        Postcode postcode = new Postcode (1055, "ABC");
    }

    @Test (expected = Exception.class)
    public void testExceptionTeWeinigLetters () throws Exception {
        Postcode postcode = new Postcode (1055, "A");
    }
}