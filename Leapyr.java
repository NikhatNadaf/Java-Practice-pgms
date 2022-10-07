
import java.util.Scanner;


public class Leapyr 
{
    public static void main(String[] args) {
        //leap year; yr divisible by 400
        //year divisible by 4 nd not divisible by 100......this is imp
        Scanner sc=new Scanner(System.in);
        int yr=sc.nextInt();
        if(yr%400==0)
        {
            System.out.println("leap year");
        }
        else if((yr%4==0) && (yr%100!=0))
        {
            System.out.println("leap year");
        }
        else
            System.out.println("not leap year");
    }
    
}
