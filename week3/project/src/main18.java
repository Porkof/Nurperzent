import java.util.Arrays;

public class main18 {
    public static void main(String[] args) {
        int[] numbers = {12, 35, 1, 10, 34, 1};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : numbers) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        System.out.println("Массив: " + Arrays.toString(numbers));
        System.out.println("Наибольшее число: " + largest);

        if (secondLargest != Integer.MIN_VALUE) {
            System.out.println("Второе по величине число: " + secondLargest);
        } else {
            System.out.println("Второго по величине числа не существует");
        }
    }
}