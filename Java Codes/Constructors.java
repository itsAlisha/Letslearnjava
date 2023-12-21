public class Constructors {
    int a,b,c;
    Constructors()
    {
        a=5;
    }
    Constructors(int y,int z)          //showing constructor overloading i.e. constructors with different size ad type of parameters
    {
        b=y;
        c=z;
    }
    void display()
    {
        System.out.println("The value of a,b,c are : "+a+","+b+","+ c);
    }

    public static void main(String[] args) {
        Constructors obj=new Constructors();
        Constructors obj1=new Constructors(12,11);
        obj.display();
        obj1.display();
    }
}
