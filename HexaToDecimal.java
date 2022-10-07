
import java.util.Scanner;


public class HexaToDecimal 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String hex=sc.next();    //hex=1AC
        int dec=0;
        int p=0;
        for(int i=hex.length()-1;i>=0;i--)        {

            if((hex.charAt(i)>='0') && (hex.charAt(i)<='9'))
            {
                dec=(int)(dec+((hex.charAt(i)-48)*Math.pow(16,p)));
                p++;
            }
            else if((hex.charAt(i)>='A') && (hex.charAt(i)<='F'))
            {
                dec+=((hex.charAt(i)-55)*Math.pow(16,p));
                p++;
            }
            
        }
        System.out.println(dec);
        
    }
    
}
