public class countdigit {
    
    public static void main(String[]arg)
    {
        int count=0;
        for(int i=0;i<=100;i++){
            if(i % 10 == 0) count++;
        }
        System.out.println(count);
    }
}
