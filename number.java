import java.io.*;
class number
{
    public static void main(String args[])throws Exception
    {
        try
        {
            FileInputStream fin =new FileInputStream("test1.txt");
            int i,l=1,w=1,ch=-1;
            while((i=fin.read())!=-1)
            {
                if(i!='\n')
                    ++ch;
                if(i=='\n') 
                    ++l;
                if(i==' '||i=='\n')
                    ++w;
            }
            System.out.println("Number of characters"+ch);
            System.out.println("Number of words"+w);
            System.out.println("Number of lines"+l);
            fin.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}