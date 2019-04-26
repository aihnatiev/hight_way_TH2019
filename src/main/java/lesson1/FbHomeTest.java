package lesson1;

import fbpages.FbHomePage;
import org.testng.annotations.Test;

public class FbHomeTest extends BaseTest {

    @Test
    public void homepageTests() {
        FbHomePage fbHomePage = new FbHomePage(getDriver());
    }
}
