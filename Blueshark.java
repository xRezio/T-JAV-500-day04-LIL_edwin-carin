public class BlueShark extends Shark {
    public BlueShark(String name) {
        super(name);
    }

    @Override
    public boolean canEat(Animal animal) {
        if (!super.canEat(animal)) return false;
        return animal instanceof Shark;
    }
}