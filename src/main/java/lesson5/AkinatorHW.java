package lesson5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class AkinatorHW {

    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "/Users/atom/Documents/autotests/hight_way_TH2019/src/main/resources/webDrivers/chromedriver");

        driver = new ChromeDriver();

        driver.get("https://ru.akinator.com/");

        WebElement play = driver.findElement(By.cssSelector(".btn-play"));

        play.click();

        WebElement question = driver.findElement(By.cssSelector(".question-text"));
        //WebElement answerOfAkinator = driver.findElement(By.cssSelector(".sub-bubble-propose"));
        WebElement yes = driver.findElement(By.cssSelector("#a_yes"));
        WebElement no = driver.findElement(By.cssSelector("#a_no"));
        WebElement dontKnow = driver.findElement(By.cssSelector("#a_dont_know"));
        WebElement probably = driver.findElement(By.cssSelector("#a_probably"));
        WebElement probablyNot = driver.findElement(By.cssSelector("#a_probaly_not"));

        do  {
            System.out.println(question.getText());
            System.out.println("Введите число от 1 до 5");
            Scanner scan = new Scanner(System.in);
            int number = scan.nextInt();

            switch (number) {
                case (1):
                    yes.click();
                    Thread.sleep(3000);
                    break;
                case (2):
                    no.click();
                    Thread.sleep(3000);
                    break;
                case (3):
                    dontKnow.click();
                    Thread.sleep(3000);
                    break;
                case (4):
                    probably.click();
                    Thread.sleep(3000);
                    break;
                case (5):
                    probablyNot.click();
                    Thread.sleep(3000);
                    break;
            }

        }while (question.isEnabled());
    }
}

