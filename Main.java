public class Main {
    public static void main(String[] args) {
        RunThread R1 = new RunThread("Thread A");
        RunThread R2 = new RunThread("Thread B");
        RunThread R3 = new RunThread("Thread C");
        R1.start();
        R2.start();
        R3.start();

    }
}
