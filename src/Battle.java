class Battle {
    //---Fields---
    final static int MAX_MONSTERS = 5;
    int x = 0; // Used to track number of monsters in the monsters array.
    Monster[] monsters;

    //---Constructor---
    Battle(){

        // Creates an array with 5 empty spaces.
        monsters = new Monster[MAX_MONSTERS];
    }

    //---Methods---
    public void add(Monster monster){

        // Check if there is available index for a new monster.
        if (x < MAX_MONSTERS){

            // This means that if there is available space in the array the new monster will be
            // assigned to that index in the array and then the x will be incremented by 1. (post-increment operator)
            monsters[x++] = monster;
        } else {
            System.out.println("No more monsters!");
        }
    }

    public void run(){
        // Looping through monsters array
        for (int i = 0; i < monsters.length; i++) {

            // Checking if space is not empty
            if (monsters[i] != null){

                // Calling attack() method of the monster at index i
                monsters[i].attack(monsters[i]);
            }
        }
    }

    public void start(){

        // Calling the run() method separately as a standard practice in case if it's long process.
        run();
    }

}
