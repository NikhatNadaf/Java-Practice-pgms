
public class removeBracketsfromalgebricalex 
{
    public static void main(String[] args) {
        String s="(a+b)=c";
        System.out.println(s);
        s=s.replaceAll("[(){}]","");
        System.out.println(s);
    }
    
}
