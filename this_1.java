
public class this_1 
{
    public static void main(String[] args) 
    {
        Student s=new Student();
        s.get(1,"jarvis");
        s.display();
        
        
        
    }
    
}
class Student
{
    int id;
    String name;
    void get(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    void display()
    {
        System.out.println("id: "+id);
        System.out.println("name: "+name);
    }
}
