import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num=sc.nextInt();
        int q=num,rev=0;
        while(q!=0)
        {
            int n=q%10;
            q=q/10;
            rev=rev*10+n;
        }
        if(num==rev)
            System.out.println("Its a Palindrome");
        else
            System.out.println("No, its not a Palindrome");
    }

}
