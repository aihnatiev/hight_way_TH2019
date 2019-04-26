package losson7;

public class MainBox {

    public static void main(String[] args) {

        Box cube = new Box();
        Box parallelepiped = new Box();

        cube.setDim(10,10,10);
        parallelepiped.setDim(10,15,20);


        cube.volune();
        parallelepiped.volune();
    }
}
