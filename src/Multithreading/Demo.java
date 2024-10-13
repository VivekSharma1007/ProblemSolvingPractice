package Multithreading;

public class Demo {

    public static void main(String[] args) {
        // by extending thread class
        Thread t1 = new ThreadCls();
        t1.start();

        // by creating the object of Runnable interface and then passing that obj to new Thread()
        MyThread runnableObj = new MyThread();
        Thread t2 = new Thread(runnableObj);
        t2.start();
    }
}
