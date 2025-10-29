import java.util.*;
public class main17 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 4, 5, 1, 6, 3};
        System.out.println("Исходный массив: " + Arrays.toString(array));

        int[] result = removeDuplicates(array);
        System.out.println("Без дубликатов: " + Arrays.toString(result));
    }

    public static int[] removeDuplicates(int[] arr) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        int[] result = new int[set.size()];
        int index = 0;
        for (int num : set) {
            result[index++] = num;
        }
        return result;
    }
}