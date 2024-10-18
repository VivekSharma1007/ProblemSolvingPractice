package Queuess;

public class QueueLinkedList {

    static class Node {
        Node next;
        int data;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {

        Node head = null;
        Node tail = null;

        public boolean isEmpty() {
            return head == null;
        }

        public void add(int data) {
            Node node = new Node(data);
            if(head == null) {
                head = tail = node;
                head.next = null;
            }
            tail.next = node;
            tail = node;
        }

        public int remove() {
            if(head == null) {
                System.out.println("empty queue");
                return -1;
            }
            int data = head.data;
            head = head.next;
            return data;
        }

        public int peek() {
            if(head == null) {
                System.out.println("empty list");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
