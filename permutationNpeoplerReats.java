
import java.util.Scanner;


public class permutationNpeoplerReats 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        int fact1=1;
        for(int i=n;i>1;i--)
        {
            fact1=fact1*i;
        }
        //System.out.println("fact1: "+fact1);
        int n1=n-r;
        System.out.println(n1);
        int fact2=1;
        for(int i=n1;i>1;i--)
        {
            fact2=fact2*i;
        }
        System.out.println(fact2);
        
        int per=fact1/fact2;
        System.out.println(per);
        
    }
    
}
