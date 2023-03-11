public class GiantSnake extends Monster {

    public static String scream = "Ssssss";

    public GiantSnake(String name) {
        super(name + " the GiantSnake", 5);
    }

//    @Override
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

    @Override
    public void attack(Monster monster){
        growl(true);
        System.out.println("     ...and hid in the grass");
    }

}