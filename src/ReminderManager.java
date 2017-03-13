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
        running = RunningStatus;
        reminderList = new ArrayList<Reminder>();

        Scanner uInput = new Scanner(System.in);

        while(running){
            System.out.println("Please enter information for a new reminder!");
            addReminder(new Reminder(uInput));
            printReminderList();
            System.out.println("\nWould you like to add another? (Y/N)");
            switch (uInput.next()){
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
/*
    @Override
    public String toString(){

    }
*/
}
