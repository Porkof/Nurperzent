public class main14 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = sumEvenIndices(array);

        System.out.println("Массив: " + java.util.Arrays.toString(array));
        System.out.println("Сумма элементов на четных индексах: " + sum);
    }

    public static int sumEvenIndices(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i += 2) {
            sum += arr[i];
        }
        return sum;

    }
}