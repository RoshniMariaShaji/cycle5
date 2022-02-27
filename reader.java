import java.io.*;
import java.util.*;
class reader 
{
    public static void main(String args[])throws Exception
    {
        try
        {
            Scanner sc=new Scanner(System.in);
            FileWriter fw =new FileWriter("test2.txt");
            System.out.println("Enter your name");
            String name=sc.nextLine();
            System.out.println("Enter your address");
            String address=sc.nextLine();
            fw.write(name+'\n');
            fw.write(address);
            fw.close();
            FileReader fr =new FileReader("test2.txt");
            int i;
            while((i=fr.read())!=-1)
            {
                System.out.print((char)i);
            }
            fr.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}