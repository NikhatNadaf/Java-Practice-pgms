//without using replaceAll() method
public class removeSpacesFromString 
{
    public static void main(String[] args) {
        String s="hello good morning";
        System.out.println(s);
        StringBuffer sb=new StringBuffer();
        char[] c=s.toCharArray();
        for(int i=0;i<c.length;i++)
        {
            if((c[i]!=' ') && (c[i]!='\t'))
            {
                sb.append(c[i]);
            }
        }
        System.out.println(sb);
    }
    
}
