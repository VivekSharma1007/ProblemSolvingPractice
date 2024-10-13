package Multithreading;

import static java.lang.Thread.currentThread;

public class MyThread implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("MyThread " + currentThread());
        }
    }
}
