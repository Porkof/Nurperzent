public class ex1 {
    private int counter = 0;
    public synchronized void increment() {
        counter++;
    }

    public int getCounter() {
        return counter;
    }

    public static void main(String[] args) {
        ex1 sharedCounter = new ex1();

        Thread[] threads = new Thread[5];

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    sharedCounter.increment();
                }
            });
            threads[i].start();
        }
        for (Thread t : threads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Final counter value: " + sharedCounter.getCounter());
    }
}