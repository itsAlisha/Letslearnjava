//public class MultilevelInheritance {}
class GrandFather
{
    int x=5;
    void display()
    {
        System.out.println("This is Grandfather of Child");
    }
    void fun1()
    {
        System.out.println("Hi, This is Grandfather Rishi");
    }
}
class Father extends GrandFather
{
    int y=7;
    void display()
    {
        System.out.println("This is Father of Child");
    }
    void fun2()
    {
        System.out.println("Hi, This is Father Sushi");
    }
}
class Children extends Father
{
    int z;
    void display()
    {
        System.out.println("This is Child proudly overriding Older Generations XD");
        z=x+y;
        System.out.println("Sum is : "+z);
    }
    void fun3()
    {
        System.out.println("Hi, This is Son Krish");
    }

    public static void main(String[] args) {
        Children obj=new Children();
        obj.display();         //Overriding, only Child class's display called
        obj.fun1();
        obj.fun2();
        obj.fun3();
    }
}