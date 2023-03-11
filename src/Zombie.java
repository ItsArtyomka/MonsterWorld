public class Zombie extends Monster {
    //---Constructor---
    public Zombie(String name) {
        super(name + " the Zombie", 5);
    }

    //---Methods---
    public void growl() {
        System.out.println("Raaaauuughhhh");
    }

    // Zombie class implements the abstract method that is in Monster
    public void attack(Monster monster) {
        monster.damage(getForce());
    }
}
