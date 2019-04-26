package losson7;

public class Polondrom {

    public static void main(String[] args) {
        String polindrom = "Искать такси";

        String newPolindrom = polindrom.replace(" ", "").toLowerCase();

        String reverse = "";

        for (int i = newPolindrom.length()-1; i >= 0; i--) {
            reverse += newPolindrom.charAt(i);
        }

        if(newPolindrom.equals(reverse)) {
            System.out.println("Это полидром детка!");
        }
    }
}
