import java.util.Random;

class RunThread implements Runnable {

    private Thread t;
    private String threadName;
    private Random random = new Random();

    RunThread ( String name) {
        threadName = name;
        System.out.println("Creating " + threadName);
    }

    @Override
    public void run() {
        System.out.println("Running " + threadName);
        int sleeper = random.nextInt(100)+10;
        try {
            for(int i = 8; i>0; i--) {
                System.out.println("Thread: "+threadName+", "+i);
                //have thread sleep for random time
                Thread.sleep(sleeper);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread "+threadName+" interrupted.");
        }
        System.out.println("Thread "+threadName+" exiting.");
    }

    public void start () {
        System.out.println("Starting "+threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}
