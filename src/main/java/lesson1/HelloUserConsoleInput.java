package lesson1;

import java.util.Scanner;

public class HelloUserConsoleInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your name: ");
        String s = scanner.nextLine();
        System.out.println("Greetings, " + s + "!");
    }

}
