
import java.util.Scanner;


public class vowelConsonant 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if((isLowercaseVowel(ch)) || (isUppercaseVowel(ch)))
        {
            System.out.println("vowel");
            
            
        }
        else
        {
            System.out.println("consonant");
        }
        
    }
    

static boolean isLowercaseVowel(char c)
{
return(c=='a' || c=='e' || c=='i' || c=='o' || c=='u');
}
static boolean isUppercaseVowel(char c)
{
return(c=='A' || c=='E' || c=='I' || c=='O' || c=='U');
}
}