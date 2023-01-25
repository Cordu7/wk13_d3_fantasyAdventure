package spells;

public abstract class Spell {
    private String name;
    private int damagePoints;

    public Spell(String name, int damagePoints) {
        this.name = name;
        this.damagePoints = damagePoints;
    }
}
