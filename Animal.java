public class Animal {
    protected enum Type {
        MAMMAL, FISH, BIRD
    }

    private static int numberOfAnimals = 0;
    private static int numberOfMammals = 0;
    private static int numberOfFish = 0;
    private static int numberOfBirds = 0;

    private String name;
    private int legs;
    protected Type type;

    protected Animal(String name, int legs, Type type) {
        this.name = name;
        this.legs = legs;
        this.type = type;
        System.out.println("My name is " + name + " and I am a " + type.toString().toLowerCase() + "!");

        numberOfAnimals++;
        switch (type) {
            case MAMMAL:
                numberOfMammals++;
                break;
            case FISH:
                numberOfFish++;
                break;
            case BIRD:
                numberOfBirds++;
                break;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLegs() {
        return legs;
    }

    public String getType() {
        return type.toString().toLowerCase();
    }

    public static void displayAnimalCount() {
        if (numberOfAnimals > 1) {
            System.out.println("There are currently " + numberOfAnimals + " animals in our world.");
        } else {
            System.out.println("There is currently " + numberOfAnimals + " animal in our world.");
        }
    }

    public static void displayMammalsCount() {
        if (numberOfMammals > 1) {
            System.out.println("There are currently " + numberOfMammals + " mammals in our world.");
        } else if (numberOfMammals == 1) {
            System.out.println("There is currently " + numberOfMammals + " mammal in our world.");
        } else {
            System.out.println("There are currently no mammals in our world.");
        }
    }

    public static void displayFishCount() {
        if (numberOfFish > 1) {
            System.out.println("There are currently " + numberOfFish + " fish in our world.");
        } else if (numberOfFish == 1) {
            System.out.println("There is currently " + numberOfFish + " fish in our world.");
        } else {
            System.out.println("There are currently no fish in our world.");
        }
    }

    public static void displayBirdsCount() {
        if (numberOfBirds > 1) {
            System.out.println("There are currently " + numberOfBirds + " birds in our world.");
        } else if (numberOfBirds == 1) {
            System.out.println("There is currently " + numberOfBirds + " bird in our world.");
        } else {
            System.out.println("There are currently no birds in our world.");
        }
    }
}
