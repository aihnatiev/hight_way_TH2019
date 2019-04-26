package losson7;

public class Box {

    public double width;
    public double height;
    public double depth;

    public void setDim(int w, int h, int d) {
        width = w;
        height = h;
        depth = d;
    }


    void volune() {
        System.out.println(width * height * depth);
    }
}
