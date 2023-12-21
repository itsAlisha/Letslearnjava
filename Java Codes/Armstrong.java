import java.util.*;
public class Armstrong {
    public static void main(String [] args)
    {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
       int num=sc.nextInt();
       int p=num;
       int q=num;
       int a=0,count=0;
       while(p!=0)
       {
           int n=p%10;
           p=p/10;
           count++;
       }
       while(q!=0)
       {
           int n=q%10;
           q=q/10;
           a= (int) (a+Math.pow(n,count));
       }
        System.out.println(a);
       if(num==a)
           System.out.println("Its an Armstrong Number");
       else
           System.out.println("No its not an Armstrong Number");
    }
}
