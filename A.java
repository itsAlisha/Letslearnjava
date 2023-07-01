public interface A {
    public void show();
}
class B2 implements A
{
    public void show()
    {
        System.out.println("Hello");
    }
    public void display()
    {
        System.out.println("Hi");
    }
}
class Test3
{
    public static void main(String[] args) {
        A obj=new B2();
        obj.show();
      //  obj.display();
        B2 obj1=new B2();
        obj1.display();
        obj1.show();
    }
}