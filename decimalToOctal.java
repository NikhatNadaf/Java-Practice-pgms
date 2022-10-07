
import java.util.Scanner;


public class decimalToOctal 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int dec=sc.nextInt();
        int r=1;
        int octal=0;
        while(dec>r)
        {
            r=dec%8;
            octal=(octal*10)+r;
            dec=dec/8;
            if((dec/8)<8)
                r=dec/8;
            
              
        }
        
        int rev=0;
        int r1;
        while(octal!=0)
        {
            r1=octal%10;
            rev=(rev*10)+r1;
            octal=octal/10;
            
        }
        System.out.println("octal: "+rev);
    }
    
}
