public class Helper {
    public static void banner(String text) {
        printStar(text.length());
        System.out.println(text);
        printStar(text.length());
    }

    private static void printStar(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
