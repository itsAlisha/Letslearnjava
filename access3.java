//public class access3 { }            //Private Access Specifier
class parent123
{
    private int i=10;
    void meth(){
        System.out.println("Value of i : "+i);
    }
}
class child123 extends parent123{
   /* void meth()
    {
        System.out.println("Value of i : "+i);
    }
    */
}

class inherit123{
    public static void main(String[]args){
        child123 ch=new child123();
        ch.meth();
    }
}
//gives error bcoz i can'tbe accessed