
import java.util.Scanner;


public class armstrongNo 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t1=n;
        int len=0;
        while(t1!=0)
        {
            t1=t1/10;
            len=len+1;
        }
       // System.out.println(len);
       int t2=n;
       int arm=0;
       
       int r;
       while(t2!=0)
       {   int mul=1;
           r=t2%10;
           for(int i=1;i<=len;i++){
               mul=mul*r;
           }
           //System.out.println(mul);
           arm=arm+mul;
           t2=t2/10;
       }
        //System.out.println(arm);
        if(arm==n)
        {
            System.out.println("Armstrong no");
        }
        else
            System.out.println("not a armstrong no");
        
        
        
    }
    
}
