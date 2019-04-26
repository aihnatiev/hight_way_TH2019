package javalesson3;

import java.util.Arrays;

public class BubleSort {

    public static void main(String[] args) {

        int ar[] = {2, 3, -1, 6, 6, 6, 7, 8, 9, 0, 1111};

        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < ar.length-1; i++) {
                if(ar[i] > ar[i+1]){
                    isSorted = false;

                    buf = ar[i];
                    ar[i] = ar[i+1];
                    ar[i+1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(ar));

    }
}
