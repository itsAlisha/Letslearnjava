public class B {
    int a,b;
    B()
    {
        a=5;
        b=9;
    }
    B(int a, int b)
    {
        this.a=a;
        this.b=b;
    }
    void display()
    {
        System.out.println("The values of a and b are : "+a+","+b);
    }

    public static void main(String[] args) {
        B obj=new B();
        B obj1=new B(55,99);
        obj.display();
        obj1.display();
    }
}
