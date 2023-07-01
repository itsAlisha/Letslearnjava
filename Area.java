public interface Area {
    final static float pi=3.14f;
    float compute(float x, float y);
}
    class Rectangle1 implements Area{
    public float compute(float p, float q)
    {
        return (p*q);
    }
    }
    class Circle implements Area
    {
        public float compute(float x, float y)
        {
            return (pi*x*x);
        }
    }
    class InterfaceTest
    {
        public static void main(String[] args) {
            Rectangle1 rect=new Rectangle1();
            Circle cir=new Circle();
            Area area;
            area=rect;
            System.out.println("Area of Rectangle is : "+ area.compute(10,20));
            area=cir;
            System.out.println("Area of Circle is : "+area.compute(2,3));
        }
    }
