package LinkedLists;

public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public Node head;
    public Node tail;
    public int size;

    public void print() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }


    public Node addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return newNode;
        }
        newNode.next = head;
        head = newNode;
        return newNode;
    }

    public Node addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
        return newNode;
    }

    public Node add(int idx, int data) {
        Node newNode = new Node(data);
        if(idx == 0) {
            return addFirst(data);
        }
        Node temp = head;

        int i = 0;
        while(i < idx - 1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
        size++;
        return newNode;
    }

    public int removeFirst() {
        if(size == 0) {
            System.out.println("empty list");
            return -1;
        } else if(size == 1) {
            int data = head.data;
            head = tail = null;
            size--;
            return data;
        }
        int data = head.data;
        head = head.next;
        size--;
        return data;
    }

    public int removeLast() {
        if(size == 0) {
            System.out.println("empty list");
            return Integer.MIN_VALUE;
        } else if(size == 1) {
            int data = head.data;
            head = tail = null;
            size = 0;
            return data;
        }
        Node prev = head;
        for(int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int data = prev.next.data;
        prev.next = null;
        tail = prev;
        return data;
    }

    public int itrSearch(int key) {
        Node temp = head;
        int idx = 0;
        while(temp != null) {
            if(temp.data == key) {
                return idx;
            }
            temp = temp.next;
            idx++;
        }
        return -1;
    }

    public int recSearch(int key) {
        Node temp = head;
        return helperRecSearch(temp, key);
    }

    private int helperRecSearch(Node head, int key) {
        if(head == null) {
            return -1;
        }
        if(head.data == key) {
            return 0;
        }

        int idx = helperRecSearch(head.next, key);

        if(idx == -1) {
            return -1;
        }
        return idx + 1;
    }


    public int search(int key) {
        Node temp = head;
        return searchHelper(temp, key, 0);
    }

    private int searchHelper(Node head, int key, int idx ) {
        if(head == null) {
            return -1;
        }
        if(head.data == key) {
            return idx;
        }

        return searchHelper(head.next, key, idx + 1);
    }

    public void reverseLL() {
        Node prev = null;
        Node current = head;
        tail = head;
        Node next;

        while(current != null) {
            next = current.next;
            current.next = prev; // where it breaks link to next and create link to prev
            prev = current;
            current = next;
        }
        head = prev;
    }

    public int findAndRemoveNthFromLast(int nth) {
        int sz = 0;
        Node temp = head;
        while(temp != null) {
            sz++;
            temp = temp.next;
        }

        if(sz == 0) {
            return  -1;
        }

        // this case will be when n == size so from last n is head
        if(sz == nth) {
            int val = head.data;
            head = head.next;
            return val;
        }

        int idx = 0;
        temp = head;
        // we are search the prev node for the nth element from the last
        while(idx < (sz - nth - 1)) {
            idx++;
            temp = temp.next;
        }

        int val = temp.next.data;
        temp.next = temp.next.next;
        return val;

    }


    // slow and fast
    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean isPalindrome() {
        if(head == null || head.next == null) {
            return true;
        }

        // find mid
        Node mid = findMid(head);

        // reverse 2nd half of the linked list
        Node prev = null;
        Node current = mid;
        Node next;

        while(current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        // check left and right part of linked list
        Node left = head;
        Node right = prev; // bcz in the last prev node would be the last node of linked list and first node of right half
        while(right != null) {
            if(left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public boolean isCircular() {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                return true;
            }
        }
        return false;
    }

    public Node isCircularNode() {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                return slow;
            }
        }
        return null;
    }


    public void removeCircular() {
        Node fast = isCircularNode();
        if(fast == null) {
            return;
        }
        Node slow = head;

        Node prev = fast;
        while(slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = null;
        tail = prev;
    }

    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // node prev to mid node
    }

    private Node merge(Node left, Node right) {
        Node  tempList = new Node(-1);
        Node temp = tempList;
        while(left != null && right != null) {
            if(left.data <= right.data) {
                temp.next = left;
                temp = temp.next;
                left = left.next;
            } else {
                temp.next = right;
                temp = temp.next;
                right = right.next;
            }
        }

        while(left != null) {
            temp.next = left;
            temp = temp.next;
            left = left.next;
        }
        while(right != null) {
            temp.next = right;
            temp = temp.next;
            right = right.next;
        }

        return tempList.next;
    }

    public Node mergeSort(Node head) {
        if(head == null || head.next == null) {
            return head;
        }

        // find mid
        Node mid = getMid(head);

        Node rightHead = mid.next;
        mid.next = null;

        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        return merge(newLeft, newRight);
    }

    public void zigZagLinkedlist() {
        // find mid
        Node slow = head;
        Node fast = head.next;  // mid is last element of 1st half

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // divide in 2 halves
        Node mid = slow;
        Node rightHead = mid.next;
        mid.next = null;

       // reverse the 2nd half
       Node prev = null;
       Node current = rightHead;
       Node next;

       while(current != null) {
           next = current.next;
           current.next = prev; // where it breaks link to next and create link to prev
           prev = current;
           current = next;
       }

       rightHead = prev;


        // zig zag
        Node lhead = head;
        Node rhead = rightHead;
        Node tempNode = new Node(-1);
        int i = 0;
        while(lhead != null && rhead != null) {
            if(i % 2 == 0) {
                tempNode.next = lhead;
                lhead = lhead.next;
            } else {
                tempNode.next = rhead;
                rhead = rhead.next;
            }
            tempNode = tempNode.next;
            i++;

        }
        while(lhead != null) {
            tempNode.next = lhead;
            lhead = lhead.next;
            tempNode = tempNode.next;
        }

        while(rhead != null) {
            tempNode.next = rhead;
            rhead = rhead.next;
            tempNode = tempNode.next;
        }
    }

}