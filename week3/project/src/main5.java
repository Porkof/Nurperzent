public class main5 {
    public static void main(String[] args) {
        String text = "hello world";
        String substring = "world";
        int index = findSubstring(text, substring);
        System.out.println("Подстрока '" + substring + "' найдена на позиции: " + index);
    }
    public static int findSubstring(String text, String substring) {
        if (substring.isEmpty()) return 0;

        int n = text.length();
        int m = substring.length();

        for (int i = 0; i <= n - m; i++) {
            boolean found = true;

            for (int j = 0; j < m; j++) {
                if (text.charAt(i + j) != substring.charAt(j)) {
                    found = false;
                    break;
                }
            }
            if (found) {
                return i;
            }
        }
        return -1;
    }
}