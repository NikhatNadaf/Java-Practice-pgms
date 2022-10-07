
import java.util.Scanner;


public class replaceSubString 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String oldString=sc.next();
        String newString=sc.next();
        String sn=s.replace(oldString, newString);
        System.out.println(sn);
        
    }
    
}
