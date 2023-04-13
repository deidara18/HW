public abstract class ThrowWeapon implements Weapon{
    int range;

    public ThrowWeapon(int range) {
        this.range = range;
    }

    public int getRange() {
        return range;
    }

    @Override
    public String toString() {
        return String.format("Лук. Урон: %d. Расстояние: %d", this.damage(), getRange());
    }
}
