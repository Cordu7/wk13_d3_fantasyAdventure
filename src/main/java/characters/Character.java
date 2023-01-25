package characters;

public abstract class Character {
    private String name;
    private int healthPoints;

    public Character(String name) {
        this.name = name;
        this.healthPoints = 15;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }
}
