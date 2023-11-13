public class Character {
    private String name;
    private int health;
    private int attackPower;

    public Character(String name, int health, int attackPower, int i, int j) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public Character(String name2, int health2, int attackPower2, int i, int j) {
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

    public boolean isAlive() {
        return health > 0;
    }
    public void heal(int amount) {
    health += amount;
    }

    public boolean engageInCombat() {
        return false;
    }
}