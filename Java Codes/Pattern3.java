import java.util.Scanner;
public class Pattern3 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num=sc.nextInt();
        for(int i=0;i<num;i++)
        {
            char alp='a';
            for(int j=num-i;j>0;j--)
            {
                System.out.print(alp);
                alp++;
            }
            System.out.println();
        }
    }
}