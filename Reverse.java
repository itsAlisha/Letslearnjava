import java.util.Scanner;
public class Reverse {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter a number : ");
        int num=sc.nextInt();
        int n,rev=0;
        while(num!=0)
        {
            n=num%10;
            num=num/10;
            rev = n+rev*10;
        }
        System.out.println("Reverse of number is : "+rev);
    }
}
