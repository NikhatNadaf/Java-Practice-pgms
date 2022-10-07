
import java.util.Scanner;


public class powerOfNum 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=sc.nextInt();
        double res=1;
        for(int i=1;i<=p;i++)
        {
            res=res*n;
        }
        System.out.println(res);
        
    }
    
}
