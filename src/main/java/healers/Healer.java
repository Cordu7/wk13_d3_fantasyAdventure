package healers;

public abstract class Healer {
    private String name;
    private int healingPoints;

    public Healer(String name, int healingPoints) {
        this.name = name;
        this.healingPoints = healingPoints;
    }
}
