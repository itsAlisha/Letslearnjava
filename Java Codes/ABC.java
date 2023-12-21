public class ABC {
    int a,b,c;
    ABC ()
    {
        a=7;
    }
    ABC(int x, int y, int z)
    {
        a=x;
        b=y;
        c=z;
    }

    public int Volume()
    {
        int V=a*b*c;
        return V;
    }
    public void area()
    {
        System.out.println("The area is : "+a*a);
    }
    public static void main(String[] args)
    {
        ABC obj1=new ABC();
        ABC obj2=new ABC(2,3,5);
        obj1.area();
        obj2.area();
        System.out.println("The volume is : "+obj2.Volume());
        System.out.println("The volume is : "+obj1.Volume());   //By default 0 values of other variables
    }
}
