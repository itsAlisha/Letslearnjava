public class Sample {
    int x;
    Sample()
    {
        this(55);
        this.access();
    }
    Sample(int x)
    {
        this.x=x;
    }
    void access()
    {
        System.out.println("x : "+x);
    }
}
class demo{
    public static void main(String[] args) {
        Sample obj=new Sample();
    }
}
