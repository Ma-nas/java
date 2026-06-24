public class circullarlinkedlist {
    public static void display(Node head){
        if(head == null){
            System.out.println("Empty list");
            return;
        }
        Node temp = head;
        do{
            System.out.print(temp.data + " ");
            temp = temp.next;
        }while(temp != head);
        System.out.println();
    }
public static Node addatstart(Node head, int data){
    Node newNode = new Node(data);
    // Case 1: The list is empty.
    if(head == null){
            newNode.next = newNode; // single node circular list
            return newNode;
    }
    // Case 2: The list has nodes. O(1) insertion.
    // Insert the new node right after the current head.
    newNode.next = head.next;
    head.next = newNode;

    // Swap the data between the head and the new node.
    int temp = head.data;
    head.data = newNode.data;
    newNode.data = temp;

    return head; // The head reference itself doesn't change.
}
public static Node deletefromstart(Node head){
    if(head == null){
        System.out.println("Empty list");
        return null;
    }
    if(head.next == head){
        return null;
    }
    Node temp = head.next;
    head.next= temp.next;
    temp.next = null;
    return head;

    }
public static Node addAtPos(Node head, int data, int pos){
    // If position is invalid, do nothing.
    if (pos < 1) {
        System.out.println("Position cannot be less than 1.");
        return head;
    }
    // If pos is 1, it's the same as adding at the start.
    if (pos == 1) {
        return addatstart(head, data);
    }

    Node newNode = new Node(data);
    Node curr = head;

    // Traverse to the node at position (pos - 1).
    // We loop pos - 2 times to get to the (pos - 1)th node.
    for (int i = 1; i < pos - 1; i++) {
        curr = curr.next;
        // If we loop back to the head, the position is out of bounds.
        if (curr == head) {
            System.out.println("Position is out of bounds.");
            return head;
        }
    }
    newNode.next = curr.next;
    curr.next = newNode;
    return head;
} 
public static Node deletefromlast(Node head){
    // if (head == null) {
    //     System.out.println("Empty list");
    //     return null;
    // }
    // if (head.next == head) {
    //     return null;
    // }
    Node curr = head;
    while(curr.next.next != head) {
        curr = curr.next;
    }
    curr.next = head;
    return head;
}
public static Node deletefrompos(Node head, int pos){
    if(pos == 1){
        return deletefromstart(head);
    }
    Node temp = head;
    int count = 1;
    while(count<pos-1 && temp != null){
        temp = temp.next;
        count++;
    }
    if(temp == null){
        System.out.println("Invalid position");
        return head;
    }
    temp.next = temp.next.next;
    return head;
}
    public static void main(String[] args){
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        // link nodes into a circular list
        n1.next = n2;
        n2.next = n3;
        n3.next = n1;

        Node head = n1; // Initialize head after creating the circular list
        System.out.print("Original list: ");
        display(head);
        System.out.println();
        // add new node at start
        head = addatstart(head, 90);
        System.out.print("After adding 90 at start: ");
        display(head);
         System.out.println();
        // add new node at position 3
        head = addAtPos(head, 60, 4);
        // display list
        System.out.print("After adding given no at given position : ");
        display(head);
        System.out.println();
        head = deletefromstart(head);
        System.out.print("After deleting from start: ");
        display(head);
        System.out.println();
        head = deletefromlast(head);
        System.out.print("After deleting from last: ");
        display(head);
        System.out.println();
        head = deletefrompos(head, 2);
        System.out.println("After deleting from position: ");
        display(head);

    }
}

class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
