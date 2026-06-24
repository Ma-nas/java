public class games {
    private String name;
    private String Genere;
    private double Rating;
    private String Downloads;
    public games() {
        this.name = "Valorant";
        this.Genere = "Multiplayer";
        this.Rating = 4.6;
        this.Downloads = "100M+";
    }
    public games(String name, String Genere, double Rating, String Downloads) {
        this.name = name;
        this.Genere = Genere;
        this.Rating = Rating;
        this.Downloads = Downloads;
    }  
    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Genere: " + Genere);
        System.out.println("Rating: " + Rating);
        System.out.println("Downloads: " + Downloads);
    }
}
class GameMain {
    public static void main(String[] args) {
        games s1 = new games("Valorant", "Multiplayer", 4.6, "100M+");
        s1.print();
        games s2 = new games("God of war", "Action", 10, "100M+");
        s2.print();
    }
}



 
    

