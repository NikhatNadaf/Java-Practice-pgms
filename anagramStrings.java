
import java.util.Scanner;


public class anagramStrings 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        int l1=s1.length();
        int l2=s2.length();
        boolean status = false;
        if(l1==l2)
        {
            for(int i=0;i<l1;i++)
            {
                if(s1.charAt(i)==s2.charAt(i))
                {
                    status=true;
                }
                else
                    status=false;
            }
        }
        if(status)
        {
            System.out.println("Anagram String");
        }
        else
        {
            System.out.println("Not Anagram String");
        }
        
    }
    
}
