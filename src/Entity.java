@SuppressWarnings({"UnusedReturnValue", "FieldMayBeFinal"}) // Make code look nicer in IDE

// This is a superclass for all the entities(monsters and objects) in the RPG Game.
abstract class Entity {

    // Fields that are common in entities.
    private String name;
    private int hp = 20;
    private boolean destroyed;

    // Constructor tha the entities with call.
    Entity(String name) {
        this.name = name;
    }

    // damage() method that is subtracting damage hp from total hp
    // and then checking if the entity in killed or not (returns true or false whether killed or not).
    protected boolean damage(int dhp) {
        hp -= dhp;
        if (hp < 0) {
            destroyed = true;
            System.out.println("Entity " + name + " was destroyed");
            return true;
        }
        return false;
    }

    // getter for destroyed boolean
    public boolean isDestroyed() {
        return destroyed;
    }
}