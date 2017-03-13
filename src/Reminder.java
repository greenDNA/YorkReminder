import java.util.Date;
import java.util.Scanner;

/**
 * Created by Trayvont on 3/12/2017.
 *
 * Class responsible for housing the individual reminders and what makes up a reminder
 */
public class Reminder {
    String reminderName;
    Date reminderDate;
    Boolean reminderStatus;
    int reminderPosition;

    /**
     * Constructors, initializing values of variables
     */
    public Reminder(Scanner uInput){
        System.out.println("Please enter information for a new reminder!");
        //to be finished, create a reminder without any parameters
        System.out.print("\nEnter name of reminder: ");
        reminderName = uInput.nextLine();
        reminderDate = new Date();
        reminderStatus = false;
    }

    public Reminder(String newName, Date newDate){
        reminderName = newName;
        reminderDate = newDate;
        reminderStatus = false;
    }

    public String getReminderName() {
        return reminderName;
    }

    public Date getReminderDate() {
        return reminderDate;
    }

    public Boolean getReminderStatus() {
        return reminderStatus;
    }

    public int getReminderPosition() {
        return reminderPosition;
    }

    public Reminder setReminderPosition(int reminderPosition) {
        this.reminderPosition = reminderPosition;
        return this;
    }

    public void setReminderStatus(Boolean reminderStatus) {
        this.reminderStatus = reminderStatus;
    }

    @Override
    /**
     * Override this to control what gets printed from a System.out.print() call or any variant of that
     */
    public String toString(){
        return "Name: "+reminderName + "\nCreated: " +reminderDate + "\nStatus: "+reminderStatus + "\nPosition: " + reminderPosition;
    }
}
