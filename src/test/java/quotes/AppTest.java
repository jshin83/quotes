package quotes;

import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void init() {
        App app = new App();
        assertNotNull("App should be initialized and not null", app);
    }
    //not sure what other tests to run
}
