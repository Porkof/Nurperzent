public class main13 {
    public static void main(String[] args) {
        int n = 30;
        System.out.println("Простые числа от 2 до " + n + ":");
        printPrimesSimple(n);
    }

    public static void printPrimesSimple(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}