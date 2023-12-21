//public class Question { }
import java.util.Scanner;
class Atransport{
    String name;
    int w;
    int charge;
 public void accept()
 {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter your NAME : ");
     name=sc.nextLine();
     System.out.println("Enter Weight : ");
     w=sc.nextInt();
 }

 public void Calculate()
 {
     if(w<=10)
     {
         charge=25*w;
     }
     else if(w>10 && w<=30)
     {
         charge=20*w;
     }
     else {
         charge=10*w;
     }
     System.out.println("Charges are : "+charge);
 }
 void print()
 {
     float bill=charge+(0.05f)*charge;
     System.out.println("Name     Weight      Bill amount");
     System.out.println(name+"    "+w+"           "+bill);
 }
}
class Main
{
    public static void main(String[] args) {
        Atransport obj=new Atransport();
        obj.accept();
        obj.Calculate();
        obj.print();
    }
}
