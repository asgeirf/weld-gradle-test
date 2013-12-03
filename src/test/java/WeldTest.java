import org.jboss.weld.environment.se.Weld;
import org.junit.Before;
import org.junit.Test;

public class WeldTest {

	@Before
	public void setup() {
        new Weld().initialize();
        // Should have failed here if beans.xml was missing
	}

    @Test
    public void do_something() {
    }

}