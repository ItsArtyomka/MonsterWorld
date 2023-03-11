public class GiantSnake extends Monster {

    public static String scream = "Ssssss";

    public GiantSnake(String name) {
        super(name + " the GiantSnake", 5);
    }

    public void growl(){
        System.out.print(scream);
    }

    public void growl(boolean loud){
        if (!loud) {
            growl();
        }
        else {
            System.out.print(scream.toUpperCase());
//            super.growl();
        }
    }

    // Snake implements the attack method that is in the Monster class.
    public void attack(Monster monster){
        growl();
        monster.damage(getForce());
        System.out.println("     ...and hid in the grass");
    }

}