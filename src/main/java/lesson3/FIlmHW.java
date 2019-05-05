package lesson3;

import lesson5.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class FIlmHW extends BaseTest {

    @Test
    public void getFilmInfo() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.get(" https://www.imdb.com/title/tt0111161/");

        WebElement filmName = driver.findElement(By.cssSelector("h1"));
        WebElement titleYear = driver.findElement(By.cssSelector("#titleYear"));
        WebElement filmTime = driver.findElement(By.cssSelector("[datetime=PT142M]"));
        WebElement ratingOfFilm = driver.findElement(By.cssSelector(".ratingValue > strong > span"));
        WebElement genre = driver.findElement(By.cssSelector("#titleStoryLine > div:nth-child(10) > a"));
        WebElement trailer = driver.findElement(By.cssSelector("#title-overview-widget .slate > a"));
        WebElement img = driver.findElement(By.cssSelector("#title-overview-widget  img"));
        WebElement director = driver.findElement(By.cssSelector(".credit_summary_item .inline + a"));
        WebElement listOfActorsBtn = driver.findElement(By.cssSelector(":nth-child(4) > a:nth-child(6)"));
        WebElement metascore = driver.findElement(By.cssSelector(".titleReviewBar > div:nth-child(1) span"));
        WebElement users = driver.findElement(By.cssSelector(".titleReviewbarItemBorder a:nth-child(1)"));
        WebElement critics = driver.findElement(By.cssSelector(".titleReviewbarItemBorder a:nth-child(3)"));
        WebElement film1 = driver.findElement(By.cssSelector(".rec_selected > div:nth-child(1) > a > img"));
        WebElement film2 = driver.findElement(By.cssSelector(".rec_selected > div:nth-child(2) > a > img"));
        WebElement film3 = driver.findElement(By.cssSelector(".rec_selected > div:nth-child(3) > a > img"));



        System.out.println("Название фильма: " + filmName.getText());
        System.out.println("Дата выхода: " + titleYear.getText());
        System.out.println("Время фильма: " + filmTime.getText());
        System.out.println("Rating: " + ratingOfFilm.getText());
        System.out.println("Genre: " + genre.getText());
        System.out.println("Trailer link: " + trailer.getAttribute("href"));
        System.out.println("Image of film: " + img.getAttribute("src"));
        System.out.println("Director of film: " + director.getText());
        System.out.println("metascore: " + metascore.getText());
        System.out.println("Similar films: " + film1.getAttribute("alt") + ", " + film2.getAttribute("alt") + ", " + film3.getAttribute("alt"));


        String countOfUsers = users.getText().replaceAll("[^0-9]", "");
        String countOfCritics = critics.getText().replaceAll("[^0-9]", "");
        System.out.println("Users: " + countOfUsers);
        System.out.println("Critics: " + countOfCritics);
        System.out.println("Users + Critics: " + (Long.valueOf(countOfCritics) + Long.valueOf(countOfUsers)));


        listOfActorsBtn.click();
        WebElement firstActor = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("tr:nth-child(2) > td:nth-child(2) > a")));
        WebElement secondActor = driver.findElement(By.cssSelector("tr:nth-child(3) > td:nth-child(2) > a"));
        WebElement thirdActor = driver.findElement(By.cssSelector("tr:nth-child(4) > td:nth-child(2) > a"));
        WebElement fourthActor = driver.findElement(By.cssSelector("tr:nth-child(5) > td:nth-child(2) > a"));
        WebElement fifthActor = driver.findElement(By.cssSelector("tr:nth-child(6) > td:nth-child(2) > a"));
            System.out.println("Actors: " + firstActor.getText() + ", " + secondActor.getText() + ", " +
                    thirdActor.getText() + ", " + fourthActor.getText() + ", " + fifthActor.getText());



    }
}
