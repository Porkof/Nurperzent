public class main2 {
    public static void main(String[] args) {
        String text = "i am vengeance i am the night i am batman";

        String longestWord = findLongestWord(text);
        System.out.println("Самое длиное слово: " + longestWord);
    }

    public static String findLongestWord(String text) {
        String[] words = text.split(" ");
        String longest = "";

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        return longest;
    }
}