import java.util.Arrays;
public class main9 {
    public static void main(String[] args) {
        String word1 = "listen";
        String word2 = "silent";

        char[] chars1 = word1.toLowerCase().toCharArray();
        char[] chars2 = word2.toLowerCase().toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        boolean isAnagram = Arrays.equals(chars1, chars2);

        System.out.println("Строка 1: " + word1);
        System.out.println("Строка 2: " + word2);
        System.out.println("Анаграммы? " + isAnagram);
    }
}