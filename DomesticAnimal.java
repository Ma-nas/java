class Animal {
    String name;
    int noofLegs;
    void sound() {
        System.out.println("Animal makes a sound");
    
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
        System.out.println("Dog's name is " + name);
        System.out.println("Dog has " + noofLegs + " legs");
    }
}
class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
        System.out.println("cats's name is " + name);
        System.out.println("cat has " + noofLegs + " legs");
    }
}
class Cow extends Animal {
    void sound() {
        System.out.println("Cow moos");
        System.out.println("Cow's name is " + name);
        System.out.println("Cow has " + noofLegs + " legs");
    }
}
public class DomesticAnimal {
    public static void main(String[] args) {
        Animal a;
        a = new Dog();
        a.name ="Bruno";
        a.noofLegs = 4;
        a.sound(); 
        
        


        a = new Cat();
        a.name ="Whiskers";
        a.noofLegs = 4;
        a.sound(); 
        

        a = new Cow();
        a.name ="Bessie";
        a.noofLegs = 4; 
        a.sound(); 
        
    }
}