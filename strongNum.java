
import java.util.Scanner;


public class strongNum 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r;
        int fact;
        
        int strong=0;
        int temp=n;
        while(n!=0)
        {
            r=n%10;
            fact=factorial(r);
            
            strong=strong+fact;
            n=n/10;
        }
        //System.out.println(strong);
        if(temp==strong)
        {
            System.out.println("Number is strong");
        }
        else
            System.out.println("Not Strong");
    }
    public static int factorial(int n)
    {
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        return f;
    }
    
}
