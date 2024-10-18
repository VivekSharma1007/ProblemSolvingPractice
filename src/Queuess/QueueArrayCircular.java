package Queuess;

public class QueueArrayCircular {
    static class Queue {
        // using array

        int arr[];
        int rear = -1;
        int front = -1;
        int size;
        Queue(int sizeOfQueue) {
            this.arr = new int[sizeOfQueue];
            this.size = sizeOfQueue;
        }


        public boolean isEmpty() {
            if(rear == -1 && front == -1) {
                return true;
            }
            return false;
        }

        public void add(int data) {
            if(rear == front) {
                System.out.println("queue is full");
                return;
            }
            if(front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        public int remove() {
            if(isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }
            int data = arr[front];
            front = (front + 1) % size;
            return data;
        }

        public int peek() {
            if(isEmpty()) {
                System.out.println("empty");
                return -1;
            }
            return arr[front];  // front
        }
    }

    public static void main(String[] args) {
        QueueArrays.Queue q = new QueueArrays.Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);
//        q.add(4);

        System.out.println(q.remove());

        q.add(4);
        q.remove();
        q.add(5);

        System.out.println(q.peek());

        while(!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }
}
