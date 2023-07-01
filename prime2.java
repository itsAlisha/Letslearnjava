import java.util.Scanner;
public class prime2 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no. : ");
        int n = sc.nextInt();
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                System.out.println("Not prime");
                return;
            }
            else {
                System.out.println("Prime");
                return;
            }
        }
    }
}
