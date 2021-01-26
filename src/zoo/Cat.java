package zoo;

public class Cat implements Climb, Run {
    @Override
    public void climb() {
        System.out.println("Cat is climbing");
    }

    @Override
    public void run() {
        System.out.println("Cat is running");
    }
}
