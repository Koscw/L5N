public class Human implements Runnable,Swimmable{
    @Override
    public void run(){
        System.out.println("Human is running");
    }
    @Override
    public void swim(){
        System.out.println("Human is swimming");
    }
}
