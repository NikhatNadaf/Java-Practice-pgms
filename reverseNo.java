
public class reverseNo 
{
    public static void main(String[] args) {
        int n=12345;
        int r=0;
        while(n!=0)
        {
            int temp=n%10;
            r=(r*10)+temp;
            n=n/10;
        }
        System.out.println(r);
    }
    
}
