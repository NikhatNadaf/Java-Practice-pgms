
public class this_2 
{
    public static void main(String[] args) 
    {
        test t=new test();
        t.n();
        
    }
    
}
class test
{
    void m()
    {
        System.out.println("inside M");
    }
    void n()
    {
        System.out.println("inside N");
        this.m();    //same as m();
    }
}
