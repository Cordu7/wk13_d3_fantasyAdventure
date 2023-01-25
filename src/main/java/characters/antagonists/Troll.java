package characters.antagonists;

import behaviours.IFight;
import characters.Character;



public class Troll extends Character implements IFight {

    private int damagePoints;

    public Troll(String name,  int damagePoints) {
        super(name);
        this.damagePoints = damagePoints;
    }

    public int dealDamage() {
        return damagePoints;
    }

    public int receiveDamage() {
        return 0;
    }

    public void receiveDamage(int point) {
        int i = this.getHealthPoints() - point;
        setHealthPoints(i);
        System.out.println(i);
    }
}
