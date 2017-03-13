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
        reminderList = new List<Reminder>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Reminder> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Reminder reminder) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Reminder> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Reminder> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Reminder get(int index) {
                return null;
            }

            @Override
            public Reminder set(int index, Reminder element) {
                return null;
            }

            @Override
            public void add(int index, Reminder element) {

            }

            @Override
            public Reminder remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Reminder> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Reminder> listIterator(int index) {
                return null;
            }

            @Override
            public List<Reminder> subList(int fromIndex, int toIndex) {
                return null;
            }
        };

        Scanner uInput = new Scanner(System.in);

        while(running){
            System.out.println("Please enter information for a new reminder!");
            addReminder(new Reminder(uInput));
            printReminderList();
            System.out.println("Would you like to add another? (Y/N)");
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
        System.out.println(reminderList.toArray());
        //System.out.println(newReminder);
    }

    /**
     * Method to print the entire main ReminderList object
     */
    public void printReminderList(){
        for(int i = 0; i < reminderList.size(); i++){
            System.out.println(reminderList.get(i));
        }
    }
}
