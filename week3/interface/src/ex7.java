interface Sortable {
    void sort(int[] arr);
}

class BubbleSort implements sortable {
    public void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

class SelectionSort implements sortable {
    public void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}

public class ex7 {
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array1 = {5, 3, 8, 4, 2};
        int[] array2 = {7, 1, 6, 9, 0};

        sortable bubble = new BubbleSort();
        sortable selection = new SelectionSort();

        bubble.sort(array1);
        selection.sort(array2);

        System.out.print("BubbleSort result: ");
        printArray(array1);

        System.out.print("SelectionSort result: ");
        printArray(array2);
    }
}
