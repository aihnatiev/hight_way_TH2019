package lesson1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Lesson1HomeWork {


    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");


        System.setProperty("webdriver.chrome.driver",
                "/Users/andrii/Documents/autotests/HighwayToHELL2019/src/main/resources/webDrivers/chromedriver");
        WebDriver driver = new ChromeDriver(options);

        WebDriverWait wait = new WebDriverWait(driver, 10);


        driver.get("https://facebook.com");

        WebElement emailInput = driver.findElement(By.cssSelector("#email"));
        WebElement passInput = driver.findElement(By.cssSelector("#pass"));
        WebElement loginButton = driver.findElement(By.cssSelector("#loginbutton"));


        emailInput.sendKeys("+380934733286");
        passInput.sendKeys("Gennadiy64");
        loginButton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".jewelButton._3eo8")));
        WebElement fbMessages = driver.findElement(By.cssSelector(".jewelButton._3eo8"));

        fbMessages.click();

        List<WebElement> allMessage = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".jewelContent li")));

        System.out.println("Radio button text:" + allMessage.get(0).getText());

        driver.quit();
    }

}
