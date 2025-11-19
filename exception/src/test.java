import javax.crypto.spec.PSource;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class test {
    List<String> word = Arrays.asList("a", "j", " b", "w", "z", "d");

    List<String> words = word.stream()
            .sorted()
            .collect(Collectors.toList());








}

