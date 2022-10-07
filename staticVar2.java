
public class staticVar2 
{
    public static void main(String[] args)
    {
        Stu s1=new Stu(1,"AB");
        s1.dis();
        Stu s2=new Stu(2,"CD");
        s2.dis();
        
    }
    
}
 class Stu
{
    int id;
    String name;
    static String cllg="ITS";
    Stu(int i,String n)
    {
        id=i;
        name=n;
    }
    void dis()
    {
        System.out.println(id+" "+name+" "+cllg);
    }
}