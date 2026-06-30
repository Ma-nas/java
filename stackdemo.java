class Stack{
    private int arr[];
    private int top;//last pointer of array 
    private int capacity;
    public Stack(int size){
        capacity = size;
        arr = new int[capacity];
        top = -1;
    

    }
    public void push(int data){
        if(top == capacity -1){
            System.out.println("Stack is full");
            return;
        
        }
        top++;
        arr[top]= data;
    }
    public int pop(){
        if(top == -1){
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top--];
    }
    public int peek(){
        if(top == -1){
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public boolean isFull(){
        return top == capacity -1;

    }
    public void display(){
        for(int i=top;i>=0;i--){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class stackdemo {
    public static void main(String[] args) {
        Stack s = new Stack(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);

        s.peek();
        System.out.println(s.peek());
        
        


        
    }
        
}
