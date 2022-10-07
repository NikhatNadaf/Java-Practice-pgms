
import java.util.Scanner;


public class factorialOfnum 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Factorial is: "+fact(n));
        
    }
    public static int fact(int n)
    {
        int f=1;
        if(n<0)
        {
            System.out.println("invalid input");
            
        }
        else
        {
            for(int i=1;i<=n;i++)
            {
                f=f*i;
            }
            
        }
        return f;
        
    }
    
}
