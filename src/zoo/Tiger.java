package zoo;

public class Tiger extends Cat {
    @Override
    public void climb() {
        System.out.println("The tiger is climbing");
    }

    @Override
    public void run() {
        System.out.println("The tiger is running");
    }
}
