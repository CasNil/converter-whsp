package Workshop;

public class Conversion {
    public static void SEK_to_USD(double amt) {
        System.out.println("1 SEK = " + 0.095 + " USD");
        System.out.println();

        System.out.println(amt + " SEK = " + (amt * 0.095) + " USD");
        System.out.println();
    }

    public static void USD_to_SEK(double amt) {
        System.out.println("1 USD = " + 10.505 + " SEK");
        System.out.println();

        System.out.println(amt + " USD = " + (amt * 10.505) + " SEK");
        System.out.println();
    }

    public static void SEK_to_Euro(double amt) {
        System.out.println("1 SEK = " + 0.089 + " Euro");
        System.out.println();

        System.out.println(amt + " SEK = " + (amt * 0.089) + " Euro");
        System.out.println();
    }

    public static void Euro_to_SEK(double amt) {
        System.out.println("1 Euro = " + 11.293 + " SEK");
        System.out.println();

        System.out.println(amt + " Euro = " + (amt * 11.293) + " SEK");
        System.out.println();
    }
}

