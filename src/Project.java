import java.util.ArrayList;
import java.util.Date;

public class Project {

    private String projectName;
    private Date createdDate;
    private String descriptionOfProject;
    private ArrayList<Task> tasks;


    public Project() {

    }

    public Project(String projectName, String descriptionOfProject) {

        this.projectName = projectName;
        this.createdDate = new Date();
        this.descriptionOfProject = descriptionOfProject;
        tasks = new ArrayList<Task>();

    }

    public Date getCreatedDate() {

        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getProjectName() {

        return projectName;
    }

    public void setProjectName(String projectName) {

        this.projectName = projectName;
    }

    public String getDescriptionOfProject() {
        return descriptionOfProject;
    }

    public void setDescriptionOfProject(String descriptionOfProject) {
        this.descriptionOfProject = descriptionOfProject;
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public void setTasks(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }

    public void add(Project project) {
    }
}



   /** @Override
    public String toString() {
        return Project{” +
               “projectName=‘” + projectName + ‘\’' +
               “, createdDate=” + createdDate +
               “, descriptionOfProject=‘” + descriptionOfProject + ‘\’' +
               “, tasks=” + tasks +
               ‘}’;
    }
}
    **/