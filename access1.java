//public class access1 { }             //Default Access Specifier
class parent1
{
    int i=10;
    void meth(){
        System.out.println("Value of i : "+i);
    }
}
class child1 extends parent1{
    void meth()
    {
        System.out.println("Value of i : "+i);
    }
}

class inherit1{
public static void main(String[]args){
        child1 ch=new child1();
        ch.meth();
        }
        }