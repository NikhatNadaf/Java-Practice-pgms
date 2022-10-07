
import java.util.Scanner;


public class primeNo 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        if(n>1)
        {
            for(int i=1;i<=n;i++)
            {
                if(n%i==0)
                {
                    count=count+1;
                }
            }
        }
        if(count>2)
        {
            System.out.println("not prime");
        }
        else
            System.out.println("prime");
    }
    
}
