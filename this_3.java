 
public class this_3 
{
    public static void main(String[] args) 
    {
        A a=new A(5);
    }
    
}
class A
{
    A()
    {
        System.out.println("inside default");
    }
    A(int x)
    {
        this();
        System.out.println("x:"+x);
        
    }
}
