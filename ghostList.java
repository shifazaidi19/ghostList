import java.util.ArrayList;    // Arrays / ArrayLists
import java.util.Scanner;      // Scanner / Input Handling
import java.util.Timer;        // Timer for auto-delete
import java.util.TimerTask;

public class ghostList {

    // ArrayList to store tasks
    static ArrayList<String> tasks = new ArrayList<>();

    // Timer for scheduling task deletion
    static Timer timer = new Timer();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Input from user
        boolean running = true;

        System.out.println("Welcome to Self-Erasing To-Do List!");

        while (running) { // Main loop
            System.out.println("\n1. Add Task\n" +
                    "2. View Tasks\n" +
                    "3. Exit");

            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            if (choice == 1) {
                addTask(sc); // call method to add task
            } else if (choice == 2) {
                viewTasks(); // call method to view tasks
            } else if (choice == 3) {
                running = false;
                System.out.println("Exiting app. Bye!");
                timer.cancel(); // Stop all scheduled tasks and exit
            } else {
                System.out.println("Invalid choice!");
            }
        }

        sc.close(); // Close scanner to release resources
    }

    // Method to add a task
    static void addTask(Scanner sc) {
        System.out.print("Enter task: ");
        String task = sc.nextLine(); // Read user input
        tasks.add(task);             // Add task to ArrayList
        System.out.println("Task added! It will auto-delete in 15 seconds...");

        // Schedule task to auto-delete after 15 seconds
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                tasks.remove(task); // Remove task from list
                System.out.println("\nTask \"" + task + "\" has been erased!");
            }
        }, 15000); // 15000 ms = 15 seconds
    }

    // Method to view current tasks
    static void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks! All done or erased.");
        } else {
            System.out.println("Your current tasks:");
            for (int i = 0; i < tasks.size(); i++) { // Loop through tasks
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }
}
