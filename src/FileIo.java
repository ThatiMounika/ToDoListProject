import java.io.*;
import java.util.ArrayList;


public class FileIo
{

    File file = new File("task.txt");

    //Writes to the file

    public void writeFile(ArrayList<Task> list)
    {
        try
        {
            FileOutputStream fo = new FileOutputStream(file);
            ObjectOutputStream output = new ObjectOutputStream(fo);
            output.writeObject(list);
            output.close();
            fo.close();
        }
        catch (IOException ex)
        {
            System.out.printf("error %s", ex);
        }
    }

    public ArrayList<Task> readFile()
    {
        //Reads from the file

        ArrayList<Task> list1 = new ArrayList<>();
        try
        {
            FileInputStream fi = new FileInputStream(file);
            ObjectInputStream input = new ObjectInputStream(fi);
            list1 = (ArrayList<Task>) input.readObject();

        }
        catch (IOException ex)
        {
            System.out.printf("error %s", ex);
        }
        catch (ClassNotFoundException ex)
        {
            //System.out.printf("error %s", ex);
        }
        return list1;

    }

}

