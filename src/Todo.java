import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Comparator;


public class Todo
{

    private Scanner scanner;
    private   FileIo io;
    private ArrayList<Task> list;


    //Constructor
    Todo()
    {
        scanner = new Scanner(System.in);
        io = new FileIo();
        list = io.readFile();
    }

    //Displaying menu

    public void display_menu()
    {
        displayDone();
        System.out.println("Select an option from the menu");
        System.out.println("1) Show task list \n2) Add new task\n3) Mark it as done\n4) Update task\n5) Remove task\n6) Save\n7) Sort by project or date\n8) Quit" );
        System.out.println("Enter an option");
        int choice=0;
        choice = scanner.nextInt();
        scanner.nextLine();

          //Switch statement with int data type

        switch (choice)
        {
            //Showing list of tasks
            case 1:
              showTask();
              break;
            //Adding new task
            case 2:
               addTask();
                break;
            //mark the task as done
            case 3:
                showTask();
                setDone();
                break;
            //update the task
            case 4:
                updateTask();
                break;
            //Remove task
            case 5:
               removeTask();
                break;
            //Saving all tasks
            case 6:
                saveTask();
                break;
            case 7:
                sortByProject(list);
                displayByDate(list);
             //Quit task
            case 8:
                quitTask();
                break;

            default:
                System.err.println("Unrecognized option");
                System.out.println("You must enter a number 1 - 8:");
                break;
        }
        display_menu();
    }

  // Method to show the list of tasks

    public void showTask()
    {

        System.out.println("*************");
        System.out.println("Tasks to do are:");
        for (int i = 0; i<list.size(); i++)
        {
            System.out.println(i + ": " + list.get(i));
            System.out.println("*************");

        }
//Method to sort by project or date
    }
    public void sortByProject(ArrayList<Task> list){
        ArrayList<Task> sorted = (ArrayList<Task>) list.stream().sorted(Comparator.comparing(task->task.getProject())).collect(Collectors.toList());
        for(Task t:sorted){
            System.out.println(t);
        }
    }
    public void displayByDate(ArrayList<Task> list){
        ArrayList<Task> sorted = (ArrayList<Task>) list.stream().sorted(Comparator.comparing(task->task.getLocalDate())).collect(Collectors.toList());
        for(Task t:sorted){
            System.out.println(t);
        }

    }

    // Method to add tasks

    public void addTask()
    {

        list = io.readFile();
        System.out.println("Enter a project");
        String project = scanner.nextLine();
        System.out.println("Enter a task name");
        String title = scanner.nextLine();
        System.out.println("How many days to complete");
        LocalDate date = LocalDate.now().plusDays(Long.parseLong(scanner.nextLine()));
        Task t = new Task(title, date, project);
        list.add(t);
        System.out.println("The task " + t.getTask_title() + " is added");

        //calling method to continue the adding tasks
        replyYesorNo();
    }

    // Method to continue adding new tasks

    public void replyYesorNo()
    {
        System.out.println("Do you want to continue(Y/N)");
        String response = scanner.nextLine();
        if (response.equalsIgnoreCase("Y"))
        {
            while (true)
            {
                try
                {
                    addTask();

                }
                catch (NullPointerException e)
                {
                    System.out.println("Added wrong details");
                }
            }
        }
        else
        {
            io.writeFile(list);
            display_menu();
        }
    }

 //Method to mark the task as done

    public void setDone()
    {

        System.out.println("Enter the index of the task");
        Scanner in = new Scanner(System.in);
        int index=in.nextInt();
        list.get(index).setStatus(true);
        io.writeFile(list);

    }

   //Displaying number of tasks done and tasks not done

    public void displayDone()
    {
        list = io.readFile();
        int done = 0, not_done = 0;
        for (Task t : list)
        {
            if (t.getStatus() == true)
            {
                done++;
            }
            else
                {
                not_done++;
            }
        }
        System.out.println("You have " + done + " task(s)  done" + " and " + not_done + " task(s) To do");
    }

    //Method to update the task with index

    public void updateTask()
    {
        showTask();
        System.out.println("Enter index number of the task to update");
        int changeIndex = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the new title");
        String newTitle = scanner.nextLine();
        list.get(changeIndex).setTask_title(newTitle);
        showTask();
    }

 //Method to remove a task from the list with index

    public void removeTask()
    {

        showTask();
        System.out.println("Enter the task index to remove");
        int index = scanner.nextInt();
        scanner.nextLine();
        list.remove(index);
        io.writeFile(list);

    }

    //Method to save task to file

    public void saveTask()
    {
        FileIo saveFile = new FileIo();
        saveFile.writeFile(list);
    }

    //Method to quit the task

    public void quitTask()
    {
        System.out.println("Good Bye");
        System.exit(0);

    }


}












