
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class charIsAlphaDigitSymbol
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
                char ch=sc.next().charAt(0);
                if((ch>='a') && (ch<='z') || (ch>='A') && (ch<='Z')){
                    System.out.println(ch+" is alphabet");
                }
                else if((ch>='0') && (ch<='9'))
                {
                    System.out.println(ch+" is digit");
                }
                else
                {
                    System.out.println(ch+" is special symbol");
                }
    }
    
}
