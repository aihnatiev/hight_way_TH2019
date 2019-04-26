package lesson3;

import lesson5.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FIlmHW extends BaseTest {

    @Test
    public void getFilmInfo() {

        driver.get(" https://www.imdb.com/title/tt0111161/");

        WebElement filmName = driver.findElement(By.cssSelector("h1"));
        WebElement titleYear = driver.findElement(By.cssSelector("#titleYear"));
        WebElement filmTime = driver.findElement(By.cssSelector("[datetime=PT142M]"));


        System.out.println(filmTime.getText());


    }
}
