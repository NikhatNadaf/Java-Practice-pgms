
import java.util.Scanner;


public class ArmstrongNofromRange 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int e=sc.nextInt();
        armstrongNo(s, e);
        
        
        
    }
   
    public static void armstrongNo(int s,int e)
    {
        for(int i=s;i<=e;i++)
        {
            int num=i;
            int arm=0;
            //int l=lenght(num);
            while(num!=0)
            {
                int r=num%10;
               
                arm=arm+(r*r*r);
                num=num/10;
            }
            //System.out.println(arm);
            if(i==arm)
            {
                System.out.println(arm);
            }
        }
        
    }
    
}
