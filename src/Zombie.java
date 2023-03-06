public class Zombie extends Monster {

    public static String scream = "Raaaauuughhhh";

    public Zombie(String name) {
        super(name + " the Zombie", 5);
    }
    // Overload this method to make SCREAMS
    @Override
    public void growl(){
        System.out.print(scream);
        super.growl();
    }

    // This method overloads growl() to make SCREAMS
    public void growl(boolean isLoud){
        if (!isLoud){
            growl();
        } else {
            System.out.print(scream.toUpperCase());
            super.growl();
        }
    }

    @Override
    public void attack(){
        super.attack();
        growl();
    }
}
