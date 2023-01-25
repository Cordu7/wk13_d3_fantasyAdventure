package weapons;

public abstract class Weapon {
        private String name;
        private int damagePoints;

        public Weapon(String name, int damagePoints) {
            this.name = name;
            this.damagePoints = damagePoints;
        }
    }
}
