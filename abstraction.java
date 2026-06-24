abstract class shape {
    abstract void area();
    
    public static void main(String[] args) {
        double radius = 5.0;
        shape s = new circle(radius);
        s.area();
    }
}

class circle extends shape {
    double radius;

    circle(double radius) {
        this.radius = radius;
    }

    @Override
    void area() {
        System.out.println("Area of circle with radius " + radius);
    }
}

public class abstraction {
    
}

//Abstraction is a fundamental concept in object-oriented programming that focuses on hiding the internal details of an object and exposing 
//only the necessary features and functionalities to the outside world. It allows developers to create complex systems by breaking them down into simpler, more manageable components.
//In Java, abstraction can be achieved through abstract classes and interfaces. An abstract class is a class that cannot be instantiated and may contain abstract methods 
//(methods without a body) that must be implemented by its subclasses. An interface is a collection of abstract methods that can be implemented by any class, regardless of its position in the class hierarchy.
//Abstraction helps in reducing complexity, improving code maintainability, and enhancing the security of the system by preventing unauthorized access to the internal workings of an object. It allows developers to
//ocus on what an object does rather than how it does it, promoting a clear separation of concerns and enabling better code organization.