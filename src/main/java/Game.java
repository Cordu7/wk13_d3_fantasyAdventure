import characters.antagonists.Ork;
import characters.protagonists.Fighter;
import com.sun.org.apache.xpath.internal.operations.Or;
import weapons.WeaponType;
import characters.antagonists.Troll;

public class Game {


    public static void main(String[] args) {
            Fighter f = new Fighter("Bob", WeaponType.KNIFE);
//            Ork ork = new Ork("John");
//        System.out.println(ork.getHealthPoints());
            fight(f, new Troll("J", 10));
            fightBack(new Troll("J", 10, f));
    }



    //
    private static void fight(Fighter f , Troll troll) {
        troll.receiveDamage(f.dealDamage());
        System.out.println(troll.getHealthPoints());
    }

    private static void fightBack( Troll troll ,Fighter f) {
        f.receiveDamage(troll.dealDamage());
        System.out.println(troll.getHealthPoints());
    }

}
