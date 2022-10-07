
import java.util.Scanner;


public class OctalTodecimal 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int octal=sc.nextInt();
        int dec=0;
        int p=0;
        while(octal>0)
        {
            int r=octal%10;
            int mul=r*(int)Math.pow(8,p);
            dec=dec+mul;
            p++;
            octal=octal/10;
        }
        System.out.println(dec);
    }
    
}
