
import java.util.Scanner;


public class fibonacciseariesNthTerm 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int f0=0;
        int f1=1;
        int nexterm;
        System.out.print(f0+" "+f1+" ");
        for(int i=3;i<=n;i++)
        {
            nexterm=f0+f1;
            System.out.print(nexterm+" ");
            f0=f1;
            f1=nexterm;
            
        }
        
    }
    
}
