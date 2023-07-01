//public class Hierarchial2 { }
class Teacher{
    int T_id,S_id;
    Teacher(){}
    Teacher(int x)
    {
        T_id=x;
    }
    void display()
    {
        System.out.println("Student studies from Teacher whose T_id is "+T_id);
    }
}
class Student1 extends Teacher{
    Student1(int w)
    {
        super(w);
        S_id=101;
    }
    void details()
    {
        System.out.println("This Student has S_id "+S_id);
    }
}
class Student2 extends Teacher{
    Student2(int w)
    {
        super(w);
        S_id=102;
    }
    void details()
    {
        System.out.println("This Student has S_id "+S_id);
    }

    public static void main(String[] args) {
      //  Teacher obj=new Teacher(1001);
        Student1 obj1=new Student1(1001);
        obj1.display();
        obj1.details();
        Student2 obj2=new Student2(1002);
        obj2.display();
        obj2.details();
    }
}