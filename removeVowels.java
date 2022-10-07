
import java.util.Scanner;


public class removeVowels 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String s1="";
        s1=s.replaceAll("[aeiouAEIOU]","");
        System.out.println("remove vowels: "+s1);
    }
    
}
