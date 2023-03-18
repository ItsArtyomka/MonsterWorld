public class Player extends Human {
    // Backpack Inner Class.
    class Backpack {
        // Items string.
        private String items = "";

        // Method to put items into a bag.
        void put(String thing) {
            items += thing + ",";
        }

        // Returns string representation of backpack's contents.
        @Override
        public String toString() {
            if (items.equals("")) { // IF backpack is empty
                return "The backpack is empty";
            } else {
                // -1 is at the end to remove the comma from the string.
                return items.substring(0, items.length() - 1) + " in the backpack";
            }
        }
    }

    // Used to store an instance of the Backpack inner class
    Backpack backpack;

    // Player Constructor.
    public Player(String name) {
        super(name + " the Player");
        // Creating backpack object.
        backpack = new Backpack();
    }

    // Method to take items and put them in a backpack.
    public void take(String thing){
        backpack.put(thing);
    }
}
