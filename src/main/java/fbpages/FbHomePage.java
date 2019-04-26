package fbpages;

import org.openqa.selenium.WebDriver;

public class FbHomePage extends BasePage {


    public FbHomePage(WebDriver driver) {
        super(driver);

        driver.get("https://facebook.com");
    }

    public FbHomePage() {

    }
}
