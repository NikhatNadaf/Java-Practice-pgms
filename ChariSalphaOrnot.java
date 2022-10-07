
import java.util.Scanner;


public class ChariSalphaOrnot 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if(((ch>=65) && (ch<=90)) || ((ch>=97) && (ch<=112)))
        {
            System.out.println(ch+" is alphabet");
        }
        else
        {
            System.out.println(ch+" is not alphabet");
        }
    }
    
}
