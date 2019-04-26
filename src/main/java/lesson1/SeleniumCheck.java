package lesson1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumCheck {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/andrii/Documents/autotests/HighwayToHELL2019/src/main/resources/webDrivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");

        WebElement element = driver.findElement(By.cssSelector(".gLFyf.gsfi"));
        element.sendKeys("Lakovich Aleksey", Keys.ENTER);

      // driver.quit();
    }
}
