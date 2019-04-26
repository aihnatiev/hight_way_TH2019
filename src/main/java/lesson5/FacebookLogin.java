package lesson5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FacebookLogin extends BaseTest{

    @Test
    public void findLoginElements() {

        driver.get("https://facebook.com");

        WebElement name = driver.findElement(By.xpath("//*[@id=\"u_0_p\"]"));
        WebElement lastName = driver.findElement(By.xpath("//*[@id=\"u_0_r\"]"));
        WebElement phoneNumberOrEmail = driver.findElement(By.xpath("//*[@id=\"u_0_u\"]"));
        WebElement newPassword = driver.findElement(By.xpath("//*[@id=\"u_0_11\"]"));
        WebElement day = driver.findElement(By.xpath("//*[@id=\"day\"]"));
        WebElement month = driver.findElement(By.xpath("//*[@id=\"month\"]"));
        WebElement year = driver.findElement(By.xpath("//*[@id=\"year\"]"));
        WebElement radioButtonWoman = driver.findElement(By.xpath("//*[@id=\"u_0_9\"]"));
        WebElement radioButtonMan = driver.findElement(By.xpath("//*[@id=\"u_0_a\"]"));

    }
}
