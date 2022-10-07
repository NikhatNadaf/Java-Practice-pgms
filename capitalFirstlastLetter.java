
import java.util.Scanner;


public class capitalFirstlastLetter 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String newstr="";
        String[] str=s.split("\\s");
        for(String string:str)
        {
            int len=string.length();
            String firstchar=string.substring(0,1);
            String restchar=string.substring(1,len-1);
            String lastchar=Character.toString(string.charAt(len-1));
            newstr=newstr+firstchar.toUpperCase()+restchar+lastchar.toUpperCase()+" ";
            
        }
        System.out.println(newstr);
             
    }
    
}
