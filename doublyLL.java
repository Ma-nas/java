class doublyll {
    static class Node {
        int data;
        Node prev;
        Node next;
        Node(int data){
            this.data = data;
            prev = null;
            next = null;
        }
    }

    public static void displayforward(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node deletefromstart(Node head){
        if(head == null || head.next == null){
            return null;
        }
        Node curr = head;
        head = head.next;
        head.prev = null;
        curr.next = null;
        return head;
    }

    public static Node deletefromlast(Node head){
        if(head == null || head.next == null){
            return null;
        }
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next.prev = null;
        temp.next = null;
        return head;
    }
    public static Node deletepos(Node head, int pos){
        Node temp = head;
        int count = 1;
        while(count<pos){
            temp = temp.next;
            count++;
        }
        if (temp.next != null) {
            temp.next.prev = temp;
            temp = temp.next;
        }
        return head;

    }

    public static void main(String[] args){
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        n1.next = n2;
        n2.prev = n1;
        n2.next = n3;
        n3.prev = n2;
        n3.next = n4;
        n4.prev = n3;

        displayforward(n1);
        n1 = deletefromstart(n1);
        displayforward(n1);
        n1 = deletefromlast(n1);
        displayforward(n1);
        n1 = deletepos(n1, 2);
        displayforward(n1);
    }

}
