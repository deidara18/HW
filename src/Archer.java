public class Archer extends Warrior<ThrowWeapon, Shield> {

    public Archer(String name, int HP, Shield shield, ThrowWeapon weapon) {
        super(name, HP, shield, weapon);
    }

    public int range() {
        return rnd.nextInt(this.weapon.range) + 1;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
