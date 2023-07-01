abstract class Figure {
    double dim1, dim2;
    Figure(double a, double b)
    {
        dim1=a;
        dim2=b;
    }
    abstract double area();
}
class Rectangle extends Figure{
    Rectangle(double a, double b)
    {
        super(a,b);
    }
    double area()
    {
        System.out.println("Inside Rectangle");
        return dim1*dim2;
    }
}
class Triangle extends Figure{
    Triangle(double a, double b)
    {
        super(a,b);
    }
    double area(){
        System.out.println("Inside Triangle");
        return (dim1*dim2)/2;
    }
}
class Demonstration
{
    public static void main(String[] args) {
       // Figure f=new Figure(10,5);
        Rectangle r=new Rectangle(9,8);
        Triangle t=new Triangle(3,4);
        Figure fg;
        fg=r;
        System.out.println("Area is "+fg.area());
        Figure fg1=new Triangle(9,1);
        System.out.println("Area is "+fg1.area());
    }
}

