interface A{
    void show();

}
interface B{
    void Display();

}
class MyInterface implements A,B{
    public void show(){
        System.out.println("This is show method");
    }
    public void Display(){
        System.out.println("This is display method");
    }
    public static void main(String[] args) {
        MyInterface obj = new MyInterface();
        obj.show();
        obj.Display();
    }
}
//interface is a collection of abstract method.It is a blueprint of the class.
//In interface we can declare method but we cannot define method.and all method are default public
//In interface we can declare variable but we cannot define variable.
