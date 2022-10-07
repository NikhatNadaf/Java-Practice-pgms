
public class removeallcharacters 
{
    public static void main(String[] args) {
        String s="he@%77l90l&&lo";
        s=s.replaceAll("[^a-zA-Z]","");
        System.out.println(s);
    }
    
}
