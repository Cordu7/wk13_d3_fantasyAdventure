package defenders;

public abstract class Defender {
    private String name;
    private int defencePoints;

    public Defender(String name, int healingPoints) {
        this.name = name;
        this.defencePoints = healingPoints;
    }
}
