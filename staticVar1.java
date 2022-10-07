
public class staticVar1 
{
    public static void main(String[] args)
    {
        Student s1=new Student(1,"AB");
        s1.disply();
        Student s2=new Student(2,"CD");
        s2.disply();
        
    }
    
}
class Student
{
    int id;
    String name;
    String cllg="ITS";
    Student(int i,String n)
    {
        id=i;
        name=n;
    }
    void disply()
    {
        System.out.println(id+" "+name+" "+cllg);
    }
    

}
