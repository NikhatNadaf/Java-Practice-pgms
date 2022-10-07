
import java.util.Scanner;


public class BinaryTODecimal 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int dec=0;
        int i=0;
        while(n>0)
        {
            int r=n%10;
            int p=r*(int)Math.pow(2,i);
            dec=dec+p;
            i++;
            n=n/10;
        }
        System.out.println(dec);
        
    }
    
}
