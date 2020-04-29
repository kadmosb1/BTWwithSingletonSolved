import org.junit.Test;
import static org.junit.Assert.*;

public class BTWVerleggingAdapterTest {

    @Test
    public void testSamenessOfAdapter () {
        BTWVerleggingAdapter verlegging1 = BTWVerleggingAdapter.getInstance ();
        BTWVerleggingAdapter verlegging2 = BTWVerleggingAdapter.getInstance ();
        assertSame (verlegging1, verlegging2);
    }

    @Test
    public void testSamenessOfVerleggin () {
        BTWVerlegging verlegging1 = BTWVerlegging.getInstance ();
        BTWVerlegging verlegging2 = BTWVerlegging.getInstance ();
        assertSame (verlegging1, verlegging2);
    }
}