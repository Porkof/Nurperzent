public class main4 {
    public static void main(String[] args) {
        String text = "Java is great and programming is powerful";

        String cleaned = text.toLowerCase().replaceAll(" ", "");

        boolean isPalindrome = true;
        int n = cleaned.length();

        for (int i = 0; i < n / 2; i++) {
            if (cleaned.charAt(i) != cleaned.charAt(n - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Текст: '" + text + "'");
        System.out.println("Является палиндромом: " + isPalindrome);
    }
}