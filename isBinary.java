
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class isBinary 
{
    static boolean isbinary(String str)
	{
            int s=0;
            
	  for(int i=0;i<str.length();i++)
	  {
	      if((str.charAt(i)=='0') || (str.charAt(i)=='1'))
	      {
	          s=1;
	      }
	      else if((str.charAt(i)=='2') || (str.charAt(i)=='3') || (str.charAt(i)=='4') || (str.charAt(i)=='5') || (str.charAt(i)=='6') || (str.charAt(i)=='7') || (str.charAt(i)=='8') || (str.charAt(i)=='9'))
	      {
	          s=0;
	      }
	  }
          if(s==1) return true;
          else return false;
	  }
	  
        }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(isbinary(str));
        
    }
    
}
