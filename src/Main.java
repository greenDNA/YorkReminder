public class Main {

    /**
     * Program created with the intentions of being a reminder
     * It will track a user's name and password for security purposes
     * It will be able to run in the background as a task manager or self fulfilled scheduler
     * It will be able to let you know when to stop doing a task and keep me on track or any
     * user on track with scheduling and setting time limits for leisure, production, or any matter
     *
     * Include support for sound, swithing focus to the application to the foreground/forefront
     * Saving user data as the application has to work with files to save settings and restoring the state
     * Upon closing the application save all data and prompt user whether or not to save files
     * Save the state of the program every X amount of time as a way to get around any power failures, or OS crashing
     * Interrupt checking for errors and input
     * Support for reflecting on past tasks
     * GUI and command line modes user can choose
     * Support keyboard shortcuts
     * Design file format that program can process with methods/functions, some file extension
     * Track version number
     * Program stage, alpha, beta, release candidate, stable, etc
     *
     *
     *
     *
     * Can java programs be hacked to access the system?
     * @param args
     */

    public static void main(String[] args) {
        Boolean running = true;
	    System.out.println("Welcome to YorkReminder! This application will ensure that your reminder needs will be met!");

        //new ReminderManager(running);
        new FileProcessor();
    }
}
