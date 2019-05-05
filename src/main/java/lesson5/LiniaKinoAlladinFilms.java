package lesson5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Scanner;

public class LiniaKinoAlladinFilms {

    @Test
    public void asd() {
        System.out.print("Введите любое целое число от 1 до 10: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println("Вы ввели число " + number);
    }
}


