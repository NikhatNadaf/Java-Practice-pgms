
import java.util.Scanner;


public class primeRange 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int count=0;
        int s=sc.nextInt();
        int e=sc.nextInt();
        for(int i=s;i<=e;i++)
        {
            for(int j=2;j<=i-1;j++)
            {
                if(i%j==0)
                {
                    count +=1;
                }
            }
            if(count==0)
            {
                System.out.println(i);
            }
            else
            {
                count=0;
            }
        }
        
        
    }
    
    
}
