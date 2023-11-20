package StenYoshiGame;

class Character {
    String name;
    int health;
    int stamina;

    public Character(String name, int health, int stamina) {
        this.name = name;
        this.health = health;
        this.stamina = stamina;
    }

    public void displayStats() {
        System.out.println(name + "'s Stats:");
        System.out.println("Health: " + health);
        System.out.println("Stamina: " + stamina);
    }
}

