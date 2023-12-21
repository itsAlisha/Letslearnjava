//public class HierarichalInheritance { }
class Mother
{
    int age =45;
    void func()
    {
        System.out.println("This is Mother of both Children");
    }
}
class Son extends Mother
{
    void display()
    {
        System.out.println("Age of my mom is : "+age);
    }
}
class daughter extends Mother
{
    void display()
    {
        System.out.println("Age of my mom is : "+age);
    }

//    public static void main(String[] args) {
//        daughter obj=new daughter();
//        obj.display();
//        obj.func();
//        Son obj1=new Son();
//        obj1.display();
//        obj1.func();
//    }
}