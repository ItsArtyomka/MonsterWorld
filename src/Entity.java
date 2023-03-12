@SuppressWarnings({"UnusedReturnValue", "FieldMayBeFinal"})

abstract class Entity {
    private String name;
    private int hp = 20;
    private boolean destroyed;

    Entity(String name) {
        this.name = name;
    }

    protected boolean damage(int dhp) {
        hp -= dhp;
        if (hp < 0) {
            destroyed = true;
            System.out.println("Entity " + name + " was destroyed");
            return true;
        }
        return false;
    }

    public boolean isDestroyed() {
        return destroyed;
    }
}