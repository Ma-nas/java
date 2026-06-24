public class finallyblock {
    public static void main(String[]args){
        try{
            int data = 25;
            int result = data / 0;
            System.out.println(result);

        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        finally{
            System.out.println("This is finally block");
        }
        System.out.println("age checked");
    }
    
}
