package  dreamfactory.learning.bogsvijet;

import dreamfactory.learning.lib.Zec;

public class BogSvijet {
    public static void main(String[] args) {
        System.out.println("Bobo smrade");
        Zec zec = new Zec();

        for (String argument : args) {
            System.out.print(argument);
        }
        System.out.println();
    }

    public static int bla(){
        return 2;
    }

}
