public class ex1 extends Thread {
    @Override
    public void run() {
        System.out.println("Hello, World!");
    }

    public static void main(String[] args) {
        ex1 thread = new ex1();
        thread.start();
    }
}