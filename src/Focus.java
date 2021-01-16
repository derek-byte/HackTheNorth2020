import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;


public class Focus {
    // create a countdown
    static int interval;
    static Timer timer;

    public static void (String[] args) {
        // User input
        Scanner sc = new Scanner(System.in);
        System.out.print("You should be studying\nAmount of Time: ");
        String secs = sc.nextLine();
        int delay = 1000;
        int period = 1000;
        timer = new Timer();
        interval = Integer.parseInt(secs);
        System.out.println(secs);
        timer.scheduleAtFixedRate(new TimerTask() {

            public void run() {
                System.out.println(setInterval());

            }
        }, delay, period);
    }

    private static final int setInterval() {
        if (interval == 1)
            timer.cancel();
        return --interval;
    }


}