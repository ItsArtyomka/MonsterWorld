@SuppressWarnings("FieldMayBeFinal") // Make code look nicer in IDE

// Abstract class for Monster that inherits the Abstract class Entity
public abstract class Monster extends Entity {
    private int force; // force that monster exerts

    // Monster constructor that inherits name from Entity class and its force.
    public Monster(String name, int force) {
        super(name);
        this.force = force;
        System.out.println("Monster " + name + " was created");
    }

    // force getter.
    public int getForce() {
        return force;
    }
}