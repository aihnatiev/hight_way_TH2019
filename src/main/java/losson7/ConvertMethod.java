package losson7;

public class ConvertMethod {

    public static void main(String[] args) {
        int inte = 2;
        double doub = 2.2;
        long lon = 124212421;
        boolean bool = true;

        String string = "";
        String string1 = "";
        String string2 = "";
        String string3 = "";

        string = String.valueOf(inte);
        string1 = String.valueOf(doub);
        string2 = String.valueOf(lon);
        string3 = String.valueOf(bool);

        System.out.println(string);
        System.out.println(string1);
        System.out.println(string2);
        System.out.println(string3);

        inte = Integer.valueOf(string);
        doub = Double.valueOf(string1);
        lon = Long.valueOf(string2);
        bool = Boolean.valueOf(string3);

        System.out.println(inte);
        System.out.println(doub);
        System.out.println(lon);
        System.out.println(bool);
    }
}
