package Multithreading.Synchronization;

public class Counter {
    public int count = 0;


    /*

    When one thread enters the synchronized block, it obtains a lock on the Counter object (this). Any other thread
    trying to enter the synchronized block will have to wait until the first thread exits the block and releases the lock.

    Once the lock is released, another thread can enter and execute the count++ statement inside the synchronized block,
    ensuring that no two threads modify the count at the same time.

     */
    public void increment() throws InterruptedException {
        // this refers to the current instance of the Counter object, so the critical section is locked on the instance.
        synchronized (this) {
            Thread.sleep(1);
            count++;
        }
    }

    // internally this is passed as lock to this synchronized method
    public synchronized void incremenets() throws InterruptedException {
        Thread.sleep(1);
        count++;
    }

    public int getCount() {
        return count;
    }
}
