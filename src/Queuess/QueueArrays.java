package Queuess;

public class QueueArrays {

    static class Queue {
        // using array

        int arr[];
        int rear = -1;
        Queue(int sizeOfQueue) {
            arr = new int[sizeOfQueue];
        }


        public boolean isEmpty() {
            return rear == -1;
        }

        public void add(int data) {
            if(rear == arr.length - 1) {
                System.out.println("queue is full");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        public int remove() {
            if(isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }
            int data = arr[0];
            for(int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return data;
        }

        public int peek() {
            if(isEmpty()) {
                System.out.println("empty");
                return -1;
            }
            return arr[0];  // front
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while(!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }
}
