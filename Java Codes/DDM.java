class Super
{
  void meth()
  {
      System.out.println("Inside Super Class");
  }
}
class Sub extends Super
{
 void meth()
 {
     System.out.println("Inside Sub Class");
 }
}
class Sub2 extends Super
{
    void meth()
    {
        System.out.println("Inside Sub2 Class");
    }
}
public class DDM {
    public static void main(String[] args) {
        Super a=new Super();
        Sub b=new Sub();
        Sub2 c=new Sub2();

        Super r;
        r=c;
        r.meth();
        r=b;
        r.meth();
        r=a;
        r.meth();
        }
    }

