package lesson5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class LiniaKinoAlladinFilms extends BaseTest {

    @Test
    public void findAllFilms() {
        driver.get("http://liniakino.com/showtimes/aladdin/");

        List<WebElement> films = driver.findElements(By.xpath("//h1/a"));

        for(WebElement film : films) {
            System.out.println(film.getText());
        }
    }
}
