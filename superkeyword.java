//public class superkeyword { }
class ABCD
{
    int x;
    ABCD(int z)
    {
        x=z;
    }
    void display()
    {
        System.out.println("Parent x = "+x);
    }
}
class ABCDE extends ABCD{
    int y;
    ABCDE(int w, int m)
    {
        super(w);
        y=m;
    }
    void display()
    {
        super.display();
        System.out.println("Child y ="+y);
    }
}
class Test{
    public static void main(String[] args) {
        ABCDE obj=new ABCDE(100,200);
        obj.display();
    }
}