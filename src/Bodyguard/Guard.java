package Bodyguard;

public abstract class Guard {

        abstract String applyMartialArts(Attacker attacker);

        String shoot(Attacker attacker) {

            return "shoot at the enemy";
        }

        String saveClientLife(Attacker attacker) {
            if (attacker.hasGun()){
                return shoot(attacker);
            }
            else{
                return applyMartialArts(attacker);
        }
        }
    }


