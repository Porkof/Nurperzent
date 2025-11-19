public class ex2 {
    private static final int MAX_NUMBER = 20;
    private static final Object lock = new Object();
    private static boolean isEvenTurn = true; // true → печатает чётные

    public static void main(String[] args) {

        Thread evenThread = new Thread(() -> {
            for (int i = 2; i <= MAX_NUMBER; i += 2) {
                synchronized (lock) {
                    while (!isEvenTurn) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("Even Number: " + i);
                    isEvenTurn = false;
                    lock.notify();
                }
            }
        });

        Thread oddThread = new Thread(() -> {
            for (int i = 1; i <= MAX_NUMBER; i += 2) {
                synchronized (lock) {
                    while (isEvenTurn) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("Odd Number: " + i);
                    isEvenTurn = true;
                    lock.notify();
                }
            }
        });

        evenThread.start();
        oddThread.start();
    }
}