package Bodyguard;

public class BodyguardMain {
    public static void main(String[] args) {
        Attacker Jo = new Attacker(false);
        Attacker Lo = new Attacker(true);
        Guard guard1 = new Boxer();
        Guard guard2 = new Karatist();
        System.out.println(guard1.saveClientLife(Jo));
        System.out.println(guard2.saveClientLife(Lo));

    }
}
