package weapons;

public enum WeaponType {

    AXE("Axe", 3),
    KNIFE("Knife", 2),
    SWORD("Sword", 5);

    private final String name;
    private final int damagePoints;

    WeaponType(String name, int damagePoints) {
        this.name = name;
        this.damagePoints = damagePoints;
    }

    public String getName() {
        return name;
    }

    public int getDamagePoints() {
        return damagePoints;
    }
}
