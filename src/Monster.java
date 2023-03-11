@SuppressWarnings("CommentedOutCode")

abstract class Monster {
    //---Fields---
    private String monsterName;
    private static String scream;
    private int force;
    private int hp = 15;
    private boolean destroyed = false;


//    public Monster(){}

    public Monster(String name, int power) {
        this.monsterName = name;
        this.force = power;
        System.out.println("Monster " + name + " was created");
    }

    //---Original Methods---
//    void growl(){
//        System.out.println(" Monster " + monsterName + " growled ");
//    }

//    void attack(){
//        System.out.println("Monster " + monsterName + " attacked with damage " + force);
//    }

    //---Abstract Methods---
    public abstract void attack(Monster monster);

    protected boolean damage(int dhp) {
        if (dhp > hp) {
            return destroyed = true;
        } else {
            return destroyed = false;
        }
    }

    protected int getForce() {
        return force;
    }

    public boolean isDestroyed() {
        return destroyed;
    }
}
