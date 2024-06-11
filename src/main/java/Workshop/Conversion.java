package Workshop;

import java.time.LocalDateTime;

public class Conversion {
    private final static double COMPARE_SEK_USD = 0.095;
    private final static double COMPARE_USD_SEK = 10.505;
    private final static double COMPARE_SEK_EURO = 0.089;
    private final static double COMPARE_EURO_SEK = 11.293;


    public static void sekToUsd(double amt) {
        System.out.println("1 SEK = " + COMPARE_SEK_USD + " USD");
        System.out.println();

        System.out.println(amt + " SEK = " + (amt * COMPARE_SEK_USD) + " USD");
        System.out.println("as of " + LocalDateTime.now());
    }

    public static void usdToSek(double amt) {
        System.out.println("1 USD = " + COMPARE_USD_SEK + " SEK");
        System.out.println();

        System.out.println(amt + " USD = " + (amt * COMPARE_USD_SEK) + " SEK");
        System.out.println("as of " + LocalDateTime.now());
    }

    public static void sekToEuro(double amt) {
        System.out.println("1 SEK = " + COMPARE_SEK_EURO + " Euro");
        System.out.println();

        System.out.println(amt + " SEK = " + (amt * COMPARE_SEK_EURO) + " Euro");
        System.out.println("as of " + LocalDateTime.now());
    }

    public static void euroToSEK(double amt) {
        System.out.println("1 Euro = " + COMPARE_EURO_SEK + " SEK");
        System.out.println();

        System.out.println(amt + " Euro = " + (amt * COMPARE_EURO_SEK) + " SEK");
        System.out.println("as of " + LocalDateTime.now());
    }
}

