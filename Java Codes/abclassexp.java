//public class abclassexp {}
    abstract class GP
    {
        abstract void callme();
        void callmetoo()
        {
            System.out.println("THIS IS NOT AN ABSTRACT METHOD");
        }
    }
    class P extends GP
    {
        void callme()
        {
            System.out.println("Parent version");
        }
    }
    class Betaji extends P
    {
        void callme()
        {
            System.out.println("Betaji1 version");
        }
    }
class Betaji2 extends Betaji
{
    void callme()
    {
        System.out.println("Betaji2 version");
    }
}
    class Testing123
    {
        public static void main(String[] args) {
            Betaji obj=new Betaji();
//          obj.callme();
//          obj.callmetoo();
            GP r;           //abstract class reference
            r=obj;
            r.callme();

        }
    }

