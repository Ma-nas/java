
class adder {
    class randomno extends adder{
        void display(){
            System.out.println("This is display method");
        }
    }
    public int add(int a, int b) {
        return a + b;
    }
    public double add(double a, double b) {
        return a + b;
    }
}
public class overloading {
    public static void main(String [] args){
        adder adder = new adder();
        int sum1 = adder.add(5, 10);
        double sum2 = adder.add(3.5, 4.5);
        System.out.println("Sum of integers: " + sum1);
        System.out.println("Sum of doubles: " + sum2);

    }
}
//in fmction overloading method call and method signature are maped to each other. method signature is the combination of method
//  name and parameter list. method call is the statement that invokes a method. when a method is called, the compiler looks for 
// a method with the same name and compatible parameter types to execute. if there are multiple methods with the same name, 
// the compiler uses the method signature to determine which method to call. this allows for function overloading, 
// where multiple methods can have the same name but different parameter lists, enabling more flexible and readable code.   
