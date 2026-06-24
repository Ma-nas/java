
class account{
    private String name;
    private int accno;
    private double balance;
    private int password;
    
    public String getName() {
        return name;
    }
    public int accno(){
        return accno;
    }
    public double getBalance() {
        return balance;
    }
    public int getPassword() {
        return password;
    }
    public void setname(String name) {
        this.name=name;
    }
    public void setaccno(int accno) {
        this.accno=accno;
    }
    public void setbalance(double balance) {
        this.balance=balance;
    }
    public void setpassword(int password) {
        this.password=password;
    }
    public int deposite(){
        if(accno==12345 && password==1234){
            balance+=1000;
        }else{
            System.out.println("Invalid account number or password");
        }
        return 0;
    }
} 


public class Encapsulation {
    public static void main(String[]args){
        account a1= new account();
        System.out.println("name: " + a1.getName());
        System.out.println("account number: " + a1.accno());
        System.out.println("balance: " + a1.getBalance());
        System.out.println("password: " + a1.getPassword());
    }

    }










