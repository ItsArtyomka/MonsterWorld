@SuppressWarnings({"UnusedReturnValue", "FieldMayBeFinal"})

public abstract class Monster {
    //---Fields---
    private String name;
    private int force;
    private int hp = 15;
    private boolean destroyed = false;

    //---Constructor---
    public Monster(String name, int force) {
        this.name = name;
        this.force = force;
        System.out.println("Monster " + name + " was created");
    }

    //---Getters---
    protected int getForce() {
        return force;
    }

    public boolean isDestroyed() {
        return destroyed;
    }

    //---Method---
    protected boolean damage(int dhp) {
        // Subtracts the damage hp from the hp.
        hp -= dhp;

        // Logic for the death of the monster.
        if (hp < 0) {
            destroyed = true;
            System.out.println("Monster " + name + " was destroyed");
            return true;
        }

        return false;
    }

    //---Abstract Class---
    // It is used and overridden by other monsters.
    public abstract void attack(Monster monster);

}
