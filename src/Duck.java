public class Duck implements Flyable,Runnable,Swimmable {
    @Override
    public void fly(){
        System.out.println("Duck is flying");
    }
    @Override
    public void run(){
        System.out.println("Duck is running");
    }
    @Override
    public void swim(){
        System.out.println("Duck is swimming");
    }
}
