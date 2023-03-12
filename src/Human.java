// This monster class inherits Monster class and implements Fighter interface.
public class Human extends Entity implements Fighter{

    public Human(String name) {
        super(name + " the Man");
    }

    // Implements the attack() method from Fighter interface.
    public void attack(Entity entity) {
        // attacking an entity with damage of force value 1 via damage() from Entity class.
        entity.damage(1);
    }
}