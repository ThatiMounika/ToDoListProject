import java.time.LocalDate;

public class Task {
    String task_title;
    String name;
    String status;
    LocalDate localDate;




    public String getName() {

        return name;
    }

    public String getStatus() {

        return status;
    }

    public LocalDate getLocalDate() {

        return localDate;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setStatus(String status) {

        this.status = status;
    }

    public void setLocalDate(LocalDate localDate) {

        this.localDate = localDate;
    }

    public String getTask_title() {

        return task_title;
    }

    public void setTask_title(String task_title) {
        this.task_title = task_title;

    }

    public void remove(String nextLine) {
    }
}
