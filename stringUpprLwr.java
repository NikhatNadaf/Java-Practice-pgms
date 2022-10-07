
public class stringUpprLwr
{
    public static void main(String[] args) {
        String s="geeksforgeeks";
        String sl="";
        String sr="";
        int len=s.length();
        
        for(int i=0;i<(len+1)/2;i++)
        {
            sl=sl+Character.toUpperCase(s.charAt(i));
        }
        for(int i=(len+1)/2;i<len-1;i++)
        {
            sr=sr+Character.toLowerCase(s.charAt(i));
        }
        System.out.println(sl+sr);
        
        
    }
    
}
