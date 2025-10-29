public class main10 {
    public static void main(String[] args) {
        String text = "Hello World This is a      test.";

        String result = text.replaceAll("\\s", "");

        System.out.println("До: '" + text + "'");
        System.out.println("После: '" + result + "'");
    }
}