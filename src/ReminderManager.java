import java.util.*;

/**
 * Created by Trayvont on 3/12/2017.
 *
 * Class that will be managing the reminders entered and tracking their attributes
 */
public class ReminderManager {
    public List<Reminder> reminderList;
    public Boolean running;

    public ReminderManager(Boolean RunningStatus){
        //Status of the program's running status
        running = RunningStatus;
        //Array containing all reminders used in the program
        reminderList = new ArrayList<Reminder>();

        //Creates scanner instance that we will be using for user input
        Scanner uInput = new Scanner(System.in);

        while(running){
            System.out.println("Please enter information for a new reminder!");
            addReminder(new Reminder(uInput));
            printReminderList();
            System.out.println("\nWould you like to add another? (Y/N)");
            //For some reason if I use uInput.next() on the following line an input bug occurs where the program defaults
            //the reminder name to a blank value if you respond to the (Y/N) with one word
            //to get around it, respond with one word, use a space(perhaps it delimits) and after the space use the words you would
            //like to be stored as the reminder's name. nextLine() solves the issue stated above when used in the below statement
            switch (uInput.nextLine()){
                case "n":
                case "N":
                    running = false;
                    break;
                default:
                    break;
            }
        }
        System.out.println("Thank you for using YorkReminder!");
    }

    /**
     * Method to add a Reminder into the main ReminderList
     * #TODO add support for location in the list of adding the reminder, as well as tail of list for preserving order
     * @param newReminder
     */
    public void addReminder(Reminder newReminder){
        reminderList.add(newReminder);
    }

    /**
     * Method to print the entire main ReminderList object
     */
    public void printReminderList(){
        for(Reminder i : reminderList){
            System.out.println("\n"+i);
        }
    }
}
