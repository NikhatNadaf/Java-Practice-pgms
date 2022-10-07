
import java.util.Scanner;


public class lengthOfString 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int l=0;
        for(char ch:s.toCharArray())
        {
            l++;
        }
        System.out.println("length: "+l);
    }
    
}
