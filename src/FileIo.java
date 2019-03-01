import java.io.*;
import java.util.ArrayList;
public class FileIo {
    public static void main(String[] args)throws FileNotFoundException,IOException,ClassNotFoundException{
        ArrayList<Task> list = new ArrayList<>();
        File file = new File("task.txt");

        //Writes to the file
        try {
            FileOutputStream fo = new FileOutputStream(file);
            ObjectOutputStream output = new ObjectOutputStream(fo);
            for (Task l : list) {
                output.writeObject(l);
            }
            output.close();
            fo.close();
        } catch (IOException ex) {
            System.out.printf("error %s", ex);
        }

        //Reads from the file
        ArrayList<Task> list1 = null;
        try {
            FileInputStream fi = new FileInputStream(file);
            ObjectInputStream input = new ObjectInputStream(fi);
            list1 = new ArrayList<>();
            while (true) {
                Task t = (Task) input.readObject();
                list1.add(t);
            }
        }






        catch (IOException ex)
        {
            System.out.printf("error %s", ex);
        }
        for (Task t : list1)
        {
            System.out.println(t);
        }
    }
}
