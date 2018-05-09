import java.io.*;

public class ResourcesTesterApp
{
    public static void main(String[] args)
    {
        String s1 = readLineWithResources();
        String s2 = readLineWithFinally();
    }

    public static String readLineWithResources()
    {
        System.out.println("Starting readLineWithResources method.");
        
        try (RandomAccessFile in = new RandomAccessFile("products.ran", "r");
        )
        {
            String s = in.readLine();
            return s;
        } 
        catch (IOException e)
        {
            System.out.println(e.toString());
            return null;
        }
    }
            
    public static String readLineWithFinally()
    {
        System.out.println("Starting readLineWithFinally method.");
        RandomAccessFile in = null;
        try
        {
            in = new RandomAccessFile("products.ran", "r");
            //UNCOMMENT TO TEST FILENOTFOUND ERROR
            //in = new RandomAccessFile("producs.ran", "r");


            String s = in.readLine();
            return s;
        } 
        catch (IOException e)
        {
            System.err.println(e.toString());
            return null;
        }
        finally {
            try {
                if (in != null) {
                    //UNCOMMENT TO TEST WHAT HAPPENS IF FILE FAILS TO CLOSE
//                    if(true)
//                        throw new IOException("IO Exception Test");
                    in.close();
                    System.out.println("File has been successfully closed");
                }else {
                    System.err.println("File not found");
                }
            }
            catch (Exception e){
                System.err.println("Unable to close file");
            }
        }
    }    
}