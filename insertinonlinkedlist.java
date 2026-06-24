public class insertinonlinkedlist {
    public static Node addatend(Node head, int data){
        Node temp = new Node(data);
        if(head == null){
            return temp;
        }
        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = temp;
        return head;
    }
    public static void addatpos(Node head, int pos ,int data){
        Node temp = new Node(data);
        Node curr= head;
        int count = 1;
        while(count<pos-1){
            curr = curr.next;
            count++;
        }
        temp.next = curr.next;
        curr.next = temp;
        

    }
    

    public static void main (String[]args){
        Node head = addatend(3, 0);
        head = addatend(head, 1);




    }

}
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
