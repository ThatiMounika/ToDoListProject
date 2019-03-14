import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;


public class TodoList {
    /**
    public static void main(String[] args) {

        TodoList tasks = new TodoList();
        tasks.display_menu();

    }



    ArrayList<Task> list = new ArrayList<>();
    String task;
    String status;


    TodoList() {

        this.task = task;
    }


    public void display_menu() {
        System.out.println("Select an option from the menu");
        System.out.println("1) Show task list \n2) Add new task\n3) Mark it as done\n4) Update\n5) Remove task\n6) save and quit" );

        Scanner in = new Scanner(System.in);
        System.out.println("Enter an option");
        int choice = in.nextInt();
        switch (choice) {
            //Showing list of tasks
            case 1:
                System.out.println("Show task list ");
                System.out.println("*************");
                System.out.println("Tasks to do are:");
                for (Task l : list) {
                    System.out.println(l.getTask_title() +  "\t" + l.getLocalDate() + "\t");
                    System.out.println("*************");

                }


                break;
                //Adding new task
            case 2:
                Scanner scanner = new Scanner(System.in);
                Task taskDetails = new Task(title, date, project);

                System.out.println("Enter a task name");
                taskDetails.setTask_title(scanner.nextLine());

                System.out.println("How many days to complete");
                LocalDate date = LocalDate.now().plusDays(Long.parseLong(scanner.nextLine()));
                taskDetails.setLocalDate(date);


                Scanner taskChoice = new Scanner(System.in);
                System.out.println("Do you want to continue(Y/N)");
                while (taskChoice.nextLine().trim().toLowerCase().equals("y")) {
                    try {
                        // Call method to add new tasks
                        System.out.println("Please add new Task");
                        System.out.println("\n");
                      //  System.out.println("Do you want to continue(Y/N)");
                        taskDetails.setTask_title(taskChoice.nextLine());
                        LocalDate date1 = LocalDate.now().plusDays(Long.parseLong(taskChoice.nextLine()));

                        taskDetails.setLocalDate(date);



                    } catch (NullPointerException e) {
                        System.out.println("Added wrong details");
                    }
                }
                break;

             //mark it as done
            case 3:
                System.out.println("You picked option 3");
                Task taskStatus = new Task(title, date, project);
                String done = null;
                taskStatus.setStatus(done);
            break;
            //update the task
            case 4:
                System.out.println("You picked option 4");
                Scanner scanner2 = new Scanner(System.in);

                break;
            //Remove task
            case 5:
                System.out.println("You picked option 5");
                System.out.println("Enter a task to remove");
                Object o = 0;
                list.remove(o);
                break;
                //Quiting and saving all the tasks
            case 6:
                System.out.println("Good Bye");
                System.exit(0);
            default:
                System.err.println("Unrecognized option");
                break;
        }
        display_menu();



    }
     **/

}












