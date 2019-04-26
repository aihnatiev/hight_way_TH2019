package lesson1;

import fbpages.LoginPage;
import fbpages.MainPage;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class GetFirstMassage extends BaseTest {

    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();

    @Test
    public void getFirstMessage() {
        mainPage = loginPage.loginInFacebook();
        System.out.println(mainPage.getFirsMassage());

    }


}
