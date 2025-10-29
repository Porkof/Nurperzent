import java.util.Arrays;

public class main15 {
    public static void main(String[] args) {
        int[] array = {3, 7, 2, 9, 1, 5, 8};
        System.out.println("Исходный массив: " + Arrays.toString(array));

        swapMinMax(array);

        System.out.println("После обмена: " + Arrays.toString(array));
    }
    public static void swapMinMax(int[] arr) {
        if (arr.length == 0) return;

        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        int temp = arr[minIndex];
        arr[minIndex] = arr[maxIndex];
        arr[maxIndex] = temp;
    }
}
