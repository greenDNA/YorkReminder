import java.util.*;

/**
 * Created by Trayvont on 3/12/2017.
 * Security checks have to be put in place************
 * Support for saving lists and loading lists
 * Support for personalized lists, password protected perhaps
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
            printMenuList();
            switch (Integer.parseInt(uInput.nextLine())){

                case 1:
                    addReminder(new Reminder(uInput).setReminderPosition(reminderList.size()+1));
                    break;
                case 2:
                    printReminderList();
                    break;
                case 3:
                    System.out.println("Enter the position of the reminder you would like to change the status of.");
                    getReminderFromList(Integer.parseInt(uInput.nextLine())-1);
                    break;
                case 4:
                    running = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    break;
            }
            //System.out.println("\nWould you like to add another? (Y/N)");
            //For some reason if I use uInput.next() on the following line an input bug occurs where the program defaults
            //the reminder name to a blank value if you respond to the (Y/N) with one word
            //to get around it, respond with one word, use a space(perhaps it delimits) and after the space use the words you would
            //like to be stored as the reminder's name. nextLine() solves the issue stated above when used in the below statement
            //nextInt and next does not consume the newline, so using nextInt and parsing it into an integer is the best way to solve
            //this oppose to dirty fixes
        }
        System.out.println("\nThank you for using YorkReminder!");
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
        System.out.println("Here is a list of your Reminder(s)!");
        for(Reminder i : reminderList){
    //add a way to track position in the reminder list, thinking of using an integer and iterate with int++ or ++int perhaps
            System.out.println("\n"+i);
        }
        System.out.println();
    }
    public void printMenuList(){
        System.out.println("Enter the appropriate choice to carry out one of the operations below.\n");
        System.out.println("1) - Create a new reminder.");
        System.out.println("2) - View a list of your reminders.");
        System.out.println("3) - Change status of your reminder.");
        System.out.println("4) - Exit program.");
        System.out.print("\nEnter your choice: ");
    }

    /**
     * Cleanup this code, gets Reminder from the reminderList ArrayList and then modifies the boolean value which
     * represents whether or not the reminder task has been completed
     * Vulnerability if user enters a value greater than the size of the ArrayList, check for OUTOFBOUNDS
     * @param choice
     */
    public void getReminderFromList(int choice){
        System.out.println("Changing the status of reminder at position " + (choice+1) +".");
        if( reminderList.get(choice).getReminderStatus() == false){
            reminderList.get(choice).setReminderStatus(true);
        }else{
            reminderList.get(choice).setReminderStatus(false);
        }
        return;
    }
}
