public class Shark extends Animal {
    private boolean frenzy = false;

    public Shark(String name) {
        super(name, 0, Type.FISH);
        System.out.println("A KILLER IS BORN!");
    }

    public void smellBlood(boolean blood) {
        frenzy = blood;
    }

    public void status() {
        if (frenzy) {
            System.out.println(getName() + " is smelling blood and wants to kill.");
        } else {
            System.out.println(getName() + " is swimming peacefully.");
        }
    }

        public boolean canEat(Animal animal) {
        if (animal == this) return false;
        return true;
    }

    public void eat(Animal animal) {
        if (canEat(animal)) {
            System.out.println(getName() + " ate a " + animal.getType() + " named " + animal.getName() + ".");
            frenzy = false;
        } else {
            System.out.println(getName() + ": It's not worth my time.");
        }
    }
}