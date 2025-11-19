import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class test {
    public static void main(String[] args) {
        List<String> word = Arrays.asList("c", "j", "b", "w", "z", "d");

        List<String> words = word.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(words);
    }
}