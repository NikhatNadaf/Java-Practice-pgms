
import java.util.Scanner;


public class HarshedNo 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int temp=n;
        while(n!=0)
        {
            int r=n%10;
            sum=sum+r;
            n=n/10;
                    
            
        }
        if(temp%sum==0)
        {
            System.out.println("Harshed no");
        }
        else
        {
            System.out.println("Not Harshed no");
        }
        
    }
    
}
