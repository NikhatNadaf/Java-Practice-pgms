
import java.util.Scanner;


public class ArmstrongNofun 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int l=lenght(n);
        //System.out.println(l);
        int t1=n;
        int r;
        int arm=0;
        while(t1!=0)
        {
            int mul=1;
            r=t1%10;
            
            for(int i=1;i<=l;i++)
            {
                mul=mul*r;
            }
            arm=arm+mul;
            t1=t1/10;
        }
        System.out.println(arm);
        if(arm==n)
        {
            System.out.println("Armstrong no");
        }
        else
            System.out.println("not Armstrong");
        
        
    }
    static int lenght(int n1)
        {
        
            int t=n1;
            int l=0;
            while(t!=0){
                t=t/10;
                l=l+1;
            }
            return l;
                
            
            
        }

    
    
}
