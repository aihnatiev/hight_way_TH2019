package javalesson3;

import java.util.Arrays;

public class ArraysSymbols {

    public static void main(String[] args) {

        char arr[] = new char[255];

        for (int i = 0; i < arr.length-1; i++) {

            arr[i] = (char) i;
        }
        System.out.println(Arrays.toString(arr));
    }
}
