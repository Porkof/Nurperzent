import java.util.*;
public class main8 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 1};

        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : numbers) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }

        System.out.println("Исходный массив: " + Arrays.toString(numbers));
        System.out.println("Дубликаты: " + duplicates);
    }
}