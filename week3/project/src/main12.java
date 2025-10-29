public class main12 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Первые " + n + " чисел Фибоначчи:");
        printFibonacci(n);
    }

    public static void printFibonacci(int n) {
        if (n <= 0) return;

        long a = 0, b = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            long next = a + b;
            a = b;
            b = next;
        }
    }
}