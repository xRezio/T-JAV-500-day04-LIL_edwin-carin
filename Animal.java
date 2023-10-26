public class Animal {
    protected enum Type {
        MAMMAL, FISH, BIRD
    }

    protected String name;
    protected int legs;
    protected Type type;

    private static int numberOfAnimals = 0;
    private static int numberOfMammals = 0;
    private static int numberOfFish = 0;
    private static int numberOfBirds = 0;

    protected Animal(String name, int legs, Type type) {
        this.name = name;
        this.legs = legs;
        this.type = type;

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

        System.out.println("My name is " + name + " and I am a " + type.toString().toLowerCase() + "!");
    }

    public String getName() {
        return name;
    }

    public int getLegs() {
        return legs;
    }

    public String getType() {
        switch (type) {
            case MAMMAL:
                return "mammal";
            case FISH:
                return "fish";
            case BIRD:
                return "bird";
            default:
                return "unknown";
        }
    }

    public static int getNumberOfAnimals() {
        if (numberOfAnimals == 1) {
            System.out.println("There is currently 1 animal in our world.");
        } else {
            System.out.println("There are currently " + numberOfAnimals + " animals in our world.");
        }
        return numberOfAnimals;
    }

    public static int getNumberOfMammals() {
        if (numberOfMammals == 1) {
            System.out.println("There is currently 1 mammal in our world.");
        } else {
            System.out.println("There are currently " + numberOfMammals + " mammals in our world.");
        }
        return numberOfMammals;
    }

    public static int getNumberOfFish() {
        if (numberOfFish == 1) {
            System.out.println("There is currently 1 fish in our world.");
        } else {
            System.out.println("There are currently " + numberOfFish + " fish in our world.");
        }
        return numberOfFish;
    }

    public static int getNumberOfBirds() {
        if (numberOfBirds == 1) {
            System.out.println("There is currently 1 bird in our world.");
        } else {
            System.out.println("There are currently " + numberOfBirds + " birds in our world.");
        }
        return numberOfBirds;
    }
}
