public class Constructors2 {
    int a,b,c;
    Constructors2()
    {
        a=5;
    }
    Constructors2(int y,int z)
    {
        b=y;
        c=z;
    }
    Constructors2(Constructors2 obj) //using copy constructor
    {
        a=55;
        b =obj.b;
        c = obj.c;
    }
    void display()
    {
        System.out.println("The value of a,b,c are : "+a+","+b+","+ c);
    }

    public static void main(String[] args) {
        Constructors2 obj=new Constructors2();
        Constructors2 obj1=new Constructors2(12,11);
        Constructors2 obj2=new Constructors2(obj1);
        obj.display();
        obj1.display();
        obj2.display();
    }
}
