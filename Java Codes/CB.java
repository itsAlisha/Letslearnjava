public interface CB {
    void clb(int param);
}
class AB1 implements CB{
    public void clb(int x)
    {
        System.out.println("Inside a version of CB");
        System.out.println("x squared is "+ x*x);
    }
}
class Test2{
    public static void main(String[] args) {
        CB obj=new AB1();
        obj.clb(5);
    }
}
