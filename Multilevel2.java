//public class Multilevel2 { }
class Student{
    int S_id;
    //Student(){}
    Student(int x)
    {
        S_id=x;
    }
}
class Subject extends Student{
    String a,b,c;
   // Subject(){}
    Subject(int w,String x, String y, String z)
    {
        super(w);
        a=x;
        b=y;
        c=z;
    }
    void display()
    {
        System.out.println("Student with S_id "+S_id+" is enrolled in Subjects : "+a+","+b+","+c);
    }
}
class Marks extends Subject{
    float p,q,r;
    Marks(int w, String n, String o, String g)
    {
        super(w,n,o,g);
//        super(n);
//        super(o);
//        super(g);
        p=55;
        q=75;
        r=90;
    }
    void average_Marks()
    {
        float avg=(p+q+r)/3;
        System.out.println("Average is "+avg);
        System.out.println("Student with "+S_id+" got total marks : "+a+","+b+","+c+" in all subjects");
    }

    public static void main(String[] args) {
//        Student obj1=new Student(101);
//        Subject obj2=new Subject("Maths","Science","Hindi");
        Marks obj3=new Marks(101,"Maths","Science","Hindi");
        obj3.display();
        obj3.average_Marks();
    }
}