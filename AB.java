public class AB {
    public void display(int x, int y)
    {
        System.out.println("The value of integer x is : "+x);
        System.out.println("The value of integer y is : "+y);
    }
    public void display(double x, double y)
    {
        System.out.println("The value of double x is : "+x);
        System.out.println("The value of double y is : "+y);
    }
    public static void main(String[] args){
        AB obj1=new AB();
        obj1.display(3,7);
        obj1.display(9.555,6.546);
    }
}
