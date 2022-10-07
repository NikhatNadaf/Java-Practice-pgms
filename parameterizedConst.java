
public class parameterizedConst 
{
    public static void main(String[] args) 
    {
        Stu s=new Stu(11,"saniya");
        s.display();
        
    }
    
}
class Stu
{
    int id;
    String name;
    Stu(int i,String n)
    {
        id=i;
        name=n;
        
    }
    void display()
    {
        System.out.println("id:"+id+" name:"+name);
        
    }
}
