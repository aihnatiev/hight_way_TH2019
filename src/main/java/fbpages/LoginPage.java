package fbpages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

    WebElement emailInput = driver.findElement(By.cssSelector("#email")),
            passInput = driver.findElement(By.cssSelector("#pass")),
            loginButton = driver.findElement(By.cssSelector("#loginbutton"));

    public LoginPage() {
        super();
    }




    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public MainPage loginInFacebook() {
        emailInput.sendKeys("+380934733286");
        passInput.sendKeys("Gennadiy64");
        loginButton.click();

        return new MainPage();
    }
}
