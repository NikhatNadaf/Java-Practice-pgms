
import java.util.Scanner;


public class greatestTwoNum 
{public static void main(String[] args) 
{
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    if(a==b)
    {
        System.out.println("Equals");
    }
    else if(a>b)
    {
        System.out.println(a+"greater");
    }
    else
        System.out.println(b+" greater");
        
    }
    
}
