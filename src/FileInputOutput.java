import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileInputOutput
{
    public void writeToFile(ArrayList<Task>list)throws IOException
    {
        FileWriter fileWriter = new FileWriter("todofile.txt");
        for(Task t : list){
            fileWriter.write(t.getProject()+ "::" +t.getTask_title() + "::" +t.getLocalDate() +"::" +t.getStatus());

        }
        fileWriter.close();
    }
}
