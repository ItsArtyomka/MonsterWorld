// This monster class inherits Monster class and implements Fighter interface
public class Zombie extends Monster implements Fighter {
    public static String scream = "Raaaauuughhhh";

    public Zombie(String name) {
        super(name + " the Zombie", 5);
    }

    public void growl() {
        System.out.println(scream);
    }

    // Implements the attack() method from Fighter interface.
    public void attack(Entity entity) {
        // attacking an entity with damage of force value via damage() from Entity class.
        entity.damage(getForce());
        growl();
    }
}