public class nthnodefromend {
    public static Node nthNode(Node head, int n) {
        int size = 0;
        Node temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        if (n > size) {
            return null;
        }
        temp = head;
        int targetIndex = size - n + 1;
        for (int i = 1; i < targetIndex; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Node head = null;
        Node temp = new Node(10);
        head = temp;
        temp = new Node(20);
        head.next = temp;
        temp = new Node(30);
        head.next.next = temp;
        temp = new Node(40);
        head.next.next.next = temp;
        temp = new Node(50);
        head.next.next.next.next = temp;
        Node result = nthNode(head, 2);
        System.out.println(result.data);
    }
        
}