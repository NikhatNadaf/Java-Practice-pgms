
import java.util.Scanner;


public class FriendlyPair 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int sum1=Sum(n1);
        int sum2=Sum(n2);
        System.out.println(sum1);
        System.out.println(sum2);
        if(sum1/n1==sum2/n2)
        {
            System.out.println("Friendly pair");
        }
        else
            System.out.println("Not friendly pair");
    }
    public static int Sum(int n)
    {
        int sum=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        return sum;
    }
    
}
