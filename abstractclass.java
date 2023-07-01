//public class abstractclass { }
abstract class S
{
    abstract void callme();
    void callmetoo()
    {
        System.out.println("THIS IS NOT AN ABSTRACT METHOD");
    }
}
class T extends S
{
    void callme()
    {
        System.out.println("Class inheriting abstract class should be declared abstract or call its abstract methods");
    }
}
class Testing
{
    public static void main(String[] args) {
 //     S obj2=new S();     no obj possible of Abstract Class
        T obj=new T();
        obj.callme();
        obj.callmetoo();
        S r;           //abstract class reference
        r=obj;
        r.callme();

    }
}

