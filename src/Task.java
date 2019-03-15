import java.io.Serializable;
import java.time.LocalDate;


public class Task implements Serializable
{
    private String project;
    private String task_title;
    private boolean status;
    private LocalDate localDate;

  public Task(String title, LocalDate date,String project)
  {
      this.project = project;
      this.task_title = title;
      this.localDate = date;

  }

    public boolean getStatus()
    {

        return status;
    }

    public LocalDate getLocalDate()
    {

        return localDate;
    }

    public void setStatus(boolean status)
    {

        this.status = true;
    }

    public void setLocalDate(LocalDate localDate)
    {

        this.localDate = localDate;
    }

    public String getTask_title()
    {

        return task_title;
    }

    public void setTask_title(String task_title)
    {
        this.task_title = task_title;

    }


    public String getProject()
    {

      return project;
    }

    public void setProject(String project)
    {
        project = project;
    }
    public String isDone()
    {
        if(this.status==true)
        {
            return "Done";
        }
        return "Not done";
    }


    @Override
    public String toString()
    {

        return project  + "\t" + task_title  + "\t due date:" + localDate+"\t" +isDone() ;
    }


}
