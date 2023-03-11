@SuppressWarnings({"UnusedReturnValue", "FieldCanBeLocal", "FieldMayBeFinal", "ConstantValue", "IfStatementWithIdenticalBranches"})

public abstract class Monster {
    private String name;
    private int force;
    private int hp = 15;
    private boolean destroyed = false;

    public Monster(String name, int force) {
        this.name = name;
        this.force = force;
        System.out.println("Monster " + name + " was created");
    }

    protected int getForce(){
        return force;
    }

    public abstract void attack(Monster monster);
    protected boolean damage(int dhp){
        if ((hp - dhp) <= 0){
            return isDestroyed();
        } else {
            hp -= dhp;
        }

        return destroyed;
    }

    public boolean isDestroyed(){
        if (hp <= 0){
            destroyed = true;
            return destroyed;
        } else {
            return destroyed;
        }
    }
}
