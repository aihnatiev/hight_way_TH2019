package lesson3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class TopFilms {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/andrii/Documents/autotests/HighwayToHELL2019/src/main/resources/webDrivers/chromedriver");
        driver = new ChromeDriver();
    }

    @Test
    public void testBrowserNavigation(){
        driver.get("https://www.imdb.com/chart/top");

        List<WebElement> titles = driver.findElements(By.xpath("//*[@class=\"titleColumn\"]//a"));
        List<WebElement> hrefs = driver.findElements(By.xpath("//*[@class=\"titleColumn\"]//a"));
        List<WebElement> ratings = driver.findElements(By.xpath("//table//tr[1]/td[3]/strong"));


        for(WebElement title : titles) {
            System.out.println(title.getText());
        }

        for(WebElement href : hrefs) {
            System.out.println(href.getAttribute("href"));
        }

        for (WebElement rating : ratings) {
            System.out.println(rating.getText());
        }

    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
