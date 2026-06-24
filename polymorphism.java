
class Polymorphism {
    void display(String name){
        System.out.println("Name: " + name);
    }
    void display(Double Rating){
        System.out.println("Rating: " + Rating);
        
    }
    void display(String Review0, String Review1, String Review2){
        System.out.println("Review: " + Review0 + ", " + Review1 + ", " + Review2);
    }
    public static void main(String[]args){
        Polymorphism p1 = new Polymorphism();
        p1.display("Valorant");
        p1.display(4.6);
        p1.display("Great game!", "Amazing graphics!", "Highly addictive!");
        

    }
}
    

