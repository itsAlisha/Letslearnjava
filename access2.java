//public class access2 { }            //Public and Protected Access Specifier
class parent12
{
    public int i=10;
    protected int j=20;
    void meth(){
        System.out.println("Value of i : "+i);
        System.out.println("Value of j : "+j);
    }
}
class child12 extends parent12{
    void meth()
    {
        System.out.println("Value of i : "+i);
        System.out.println("Value of j : "+j);
    }
}

class inherit12{
    public static void main(String[]args){
        child12 ch=new child12();
        ch.meth();
    }
}