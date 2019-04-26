package fbpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MainPage extends BasePage {
    public MainPage(WebDriver driver) {
        super(driver);
    }

    WebElement fbNotificationsJewel = driver.findElement(By.cssSelector(".jewelButton._3eo9"));
    List<WebElement> allMessages = driver.findElements(By.cssSelector("#js_jh ul :first-child ul"));

    public MainPage() {

    }

    public String getFirsMassage() {
        fbNotificationsJewel.click();
        String text = allMessages.get(0).getText();

        return text;
    }
}
