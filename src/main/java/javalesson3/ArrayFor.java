package javalesson3;

public class ArrayFor {

    public static void main(String[] args) {

        int intArray[] = {1,2,3};
        intArray[0] = 4;
        intArray[1] = 12;
        intArray[2] = 33;

        for(int i=0; i<intArray.length; i++){
            System.out.println(intArray[i]);
        }

    }
}
