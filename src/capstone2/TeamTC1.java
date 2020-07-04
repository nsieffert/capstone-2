package concurrency;
import java.util.ArrayList;
import java.util.List;

class TeamTC1 implements Runnable {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_BRIGHT_RED = "\u001b[31;1m";
    public static final String ANSI_BRIGHT_GREEN = "\u001b[32;1m";
    public static final  String ANSI_BRIGHT_YELLOW = "\u001b[33;1m";
    public static final String ANSI_BRIGHT_BLUE =  "\u001b[34;1m";
    public static final String ANSI_BRIGHT_MAGENTA = "\u001b[35;1m";
    public static final String ANSI_BRIGHT_CYAN =  "\u001b[36;1m";
    List<String> team = new ArrayList<>();
    private String name;

    public TeamTC1(String name) {
        this.name = name;
    }

    public void run() {
        Thread.currentThread().setName(name);
        try {
            Thread.sleep(1000);
            System.out.println(ANSI_BLUE + "Dylan Fellows" + ANSI_RESET + Thread.currentThread().getName());
            team.add("Dylan Fellows");
            Thread.sleep(1000);
            System.out.println(ANSI_RED + "Jeramie Andrews" + ANSI_RESET + Thread.currentThread().getName());
            team.add("Jeramie Andrews");
            Thread.sleep(1000);
            System.out.println(ANSI_GREEN + "Victor Betts" + ANSI_RESET + Thread.currentThread().getName());
            team.add("Victor Betts");
            Thread.sleep(1000);
            System.out.println(ANSI_YELLOW + "Sabitha Radhakrishnan" + ANSI_RESET + Thread.currentThread().getName());
            team.add("Sabitha Radhakrishnan");
            Thread.sleep(1000);
            System.out.println(ANSI_PURPLE + "Jessica Ulysse" + ANSI_RESET + Thread.currentThread().getName());
            team.add("Jessica Ulysse");
            Thread.sleep(1000);
            System.out.println(ANSI_CYAN + "Matthew Castiglione" + ANSI_RESET + Thread.currentThread().getName());
            team.add("Matthew Castiglione");
            Thread.sleep(1000);
            System.out.println(ANSI_BRIGHT_RED + "Vani Muppuru" + ANSI_RESET + Thread.currentThread().getName());
            team.add("Vani Muppuru");
            Thread.sleep(1000);
            System.out.println(ANSI_BRIGHT_BLUE + "Kevin Ibanez" + ANSI_RESET + Thread.currentThread().getName());
            team.add("Kevin Ibanez");
            Thread.sleep(1000);
            System.out.println(ANSI_BRIGHT_GREEN + "Nancy Golden" + ANSI_RESET + Thread.currentThread().getName());
            team.add("Nancy Golden");
            Thread.sleep(1000);
            System.out.println(ANSI_BRIGHT_YELLOW + "Vimala Murthy" + ANSI_RESET + Thread.currentThread().getName());
            team.add("Vimala Murthy");
            Thread.sleep(1000);
            System.out.println(ANSI_BRIGHT_CYAN + "John Kol" + ANSI_RESET + Thread.currentThread().getName());
            team.add("John Kol");
            Thread.sleep(1000);
            System.out.println(ANSI_BRIGHT_MAGENTA + "George Torres" + ANSI_RESET + Thread.currentThread().getName());
            team.add("George Torres");
            Thread.sleep(1000);
            System.out.println(ANSI_RED + "Norita Sieffert" + ANSI_RESET + Thread.currentThread().getName());
            Thread.sleep(1000);
            System.out.println(team.toString());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

//This thread should be created by implementing the Runnable interface,
// NOT by extending the Thread class.  In the run method of this thread, print out the
// name of each student in your TA group,
// (starting with your TA).
// There should be a pause of 1 second before each name is printed to the console.
// The name should then be pushed to the team List
// After all the names have been pushed to this List,
// print out the entire list of all the students in your TA group. Don't forget your TA as well!
// All of these steps should be done whenever the thread is started.
// (i.e. it can be done directly in the run()method of the thread itself).
// Kick off the thread in the Main class of the concurrency package.