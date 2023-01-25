package characters.protagonists;

import behaviours.IFight;
import characters.Character;
import characters.antagonists.Troll;
import weapons.WeaponType;



public class Fighter extends Character implements IFight {


    private final WeaponType weaponType;

    public Fighter(String name,  WeaponType weaponType) {
        super(name);
        this.weaponType = weaponType;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }


    public int dealDamage() {
        return this.weaponType.getDamagePoints();
    }


    public void receiveDamage(int point) {
        int i = this.getHealthPoints() - point;
        setHealthPoints(i);
    }
}
