class heap{
    int arr[];
    int size;

    public heap(){
        arr = new int[100];
        size = 0;
    }
    public void invert(int data){
        arr[size] = data;
        int index = size;
        size++;
        while (index > 0) {
            int parent = (index - 1) / 2;
            if (arr[parent] < arr[index]) {
                int temp = arr[parent];
                arr[parent] = arr[index];
                arr[index] = temp;
                index = parent;
            } else {
                break;
            }
        }
    }
    public void delete(){
        

    }
    public static void main(String[] args) {
        heap h = new heap();
        h.invert(10);
        h.invert(20);
        h.invert(5);
        h.invert(15);
        for (int i = 0; i < h.size; i++) {
            System.out.print(h.arr[i] + " ");
        }
    }
} 
