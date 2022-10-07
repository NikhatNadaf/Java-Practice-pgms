
import java.util.Scanner;


public class AutomorphicNo 
{public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sqr=n*n;
        if(sqr%10==n)
        {
            System.out.println("Automorphic no");
        }
        else
                System.out.println("Not Automorphic no ");
    }
    
}
