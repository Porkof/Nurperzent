import java.util.*;
public class main11 {
    public static void main(String[] args) {
        String text = "hello world";

        Map<Character, Integer> countMap = new HashMap<>();

        for (char c : text.toCharArray()) {
            if (countMap.containsKey(c)) {
                countMap.put(c, countMap.get(c) + 1);
            } else {
                countMap.put(c, 1);
            }
        }

        System.out.println("Частота символов в строке: '" + text + "'");
        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            char c = entry.getKey();
            String displayChar = (c == ' ') ? "пробел" : String.valueOf(c);
            System.out.println(displayChar + ": " + entry.getValue());
        }
    }
}