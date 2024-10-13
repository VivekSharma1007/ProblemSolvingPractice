package Multithreading.Synchronization;

public class Demo {
    public static void main(String[] args) throws InterruptedException {

        Counter count = new Counter();
        Thread t1 = new Thread(() -> {     // sending object of runnable type
            for (int i = 0; i < 2000; i++) {
                try {
                    count.increment();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i = 0; i < 2000; i++) {
                try {
                    count.increment();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(count.getCount());
    }
}
