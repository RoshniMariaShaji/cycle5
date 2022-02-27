import java.io.*;
class fileline 
{
    public static void main(String args[])throws Exception
    {
        try
        {
            FileInputStream fin =new FileInputStream("test.txt");
            int i,n=1;
            System.out.print(n+" ");
            while((i=fin.read())!=-1)
            {
                System.out.print((char)i);
                if(i=='\n') 
                    System.out.print(++n+" ");
            }
            fin.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}