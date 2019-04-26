package lesson5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class JavaNumbersHW {

    public static void main(String[] args) {
        int a = 10, b = 20, c = 30, d = 30;

        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(a, b, c, d));

        int minValue = Collections.min(numbers);
        int maxValue = Collections.max(numbers);

        int countOfMaxValues = 0;
        for (Integer number : numbers) {
            if (number == maxValue) {
                countOfMaxValues++;
            }
        }
        System.out.println("Min of numbers: " + minValue);
        System.out.println("Count of max values: " + countOfMaxValues);

        int z = 421, x = 11, v = 566, n = 12414, m = 56657;

        ArrayList<Integer> numbers2 = new ArrayList<Integer>(Arrays.asList(z, x, v, n, m));

        int minValue2 = Collections.min(numbers2);
        int maxValue2 = Collections.max(numbers2);

        System.out.println("Min of numbers: " + minValue2);
        System.out.println("Max of numbers: " + maxValue2);


        String name = "Pavel", name2 = "Pavel";

        if (name == name2) {
            System.out.println("люди являются тезками.");
        }

        int month = 12;

        switch (month) {
            case (1):
                System.out.println("January");
                break;
            case (2):
                System.out.println("February");
                break;
            case (3):
                System.out.println("March");
                break;
            case (4):
                System.out.println("April");
                break;
            case (5):
                System.out.println("May");
                break;
            case (6):
                System.out.println("June");
                break;
            case (7):
                System.out.println("July");
                break;
            case (8):
                System.out.println("August");
                break;
            case (9):
                System.out.println("September");
                break;
            case (10):
                System.out.println("October");
                break;
            case (11):
                System.out.println("November");
                break;
            case (12):
                System.out.println("December");
                break;
            default:
                System.out.println("Wrong month");
                break;
        }
    }


}
