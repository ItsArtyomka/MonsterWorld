// Coded mostly by me.
// Project about Monsters from SkillFactory Lectures.
public class Main {
    public static void main(String[] args) {

        // Creating a battle object that creates an empty array with 5 space.
        Battle battle = new Battle();

        // Creating the new monsters meaning that the array is getting filled with 5 monsters.
        battle.add(new Zombie("Alice"));
        battle.add(new Zombie("Bob"));
        battle.add(new Zombie("Eve"));
        battle.add(new GiantSnake("Kaa"));
        battle.add(new GiantSnake("Son of Kaa"));

        // Creating new monster to check the logic in the run() method
        // therefore the two new monster will not be added to the array because by logic it will overflow the array
        // so it's not going to add them to the already filled array.
//        battle.add(new Zombie("Noname"));
//        battle.add(new GiantSnake("Noname"));

        // Calls start() method that calls the run method.
        battle.start();
    }

}
