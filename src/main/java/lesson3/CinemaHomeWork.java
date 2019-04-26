package lesson3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class CinemaHomeWork {


    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");


        System.setProperty("webdriver.chrome.driver",
                "/Users/andrii/Documents/autotests/HighwayToHELL2019/src/main/resources/webDrivers/chromedriver");
        WebDriver driver = new ChromeDriver(options);

        WebDriverWait wait = new WebDriverWait(driver, 10);


        driver.get("http://liniakino.com/showtimes/aladdin/");

        WebElement filmDambo = driver.findElement(By.xpath("//a[text() = 'Дамбо']"));

        filmDambo.click();

        WebElement button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".button.inline")));

        button.click();

        WebElement firstSession = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#content-inner ul li ul :first-child > a")));

        firstSession.click();

        WebElement iframeElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe")));
        driver.switchTo().frame(iframeElem);

        WebElement iframeWindow = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".window")));
        WebElement modalWindowClose = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".arcticmodal-close")));

        if (iframeWindow.isEnabled()) {
            Actions actions = new Actions(driver);
            actions.moveToElement(modalWindowClose).click().perform();

            List<WebElement> freeSeats = driver.findElements(By.cssSelector(".seat.seat-color1"));
            List<WebElement> busySeats = driver.findElements(By.cssSelector(".seat.seat-occupied"));

            int countOfFreeSeats = freeSeats.size();
            int countOfBusySeats = busySeats.size();

            System.out.println("All Seats: " + (countOfFreeSeats + countOfBusySeats));
            System.out.println("Free Seats: " + countOfFreeSeats);
            System.out.println("Busy Seats: " + countOfBusySeats);
            System.out.println("Free seats in %: " + (countOfFreeSeats*100) / (countOfFreeSeats + countOfBusySeats) + "%");
            System.out.println("Busy seats in %: " + (countOfBusySeats*100) / (countOfFreeSeats + countOfBusySeats) + "%");
        }else {
            List<WebElement> freeSeats = driver.findElements(By.cssSelector(".seat.seat-color1"));
            List<WebElement> busySeats = driver.findElements(By.cssSelector(".seat.seat-occupied"));

            int countOfFreeSeats = freeSeats.size();
            int countOfBusySeats = busySeats.size();

            System.out.println("All Seats: " + (countOfFreeSeats + countOfBusySeats));
            System.out.println("Free Seats: " + countOfFreeSeats);
            System.out.println("Busy Seats: " + countOfBusySeats);
            System.out.println("Free seats in %: " + (double) (countOfFreeSeats*100) / (countOfFreeSeats + countOfBusySeats) + "%");
            System.out.println("Busy seats in %: " + (double) (countOfBusySeats*100) / (countOfFreeSeats + countOfBusySeats) + "%");
        }
        driver.quit();
    }
}