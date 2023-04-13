public class WoodShield extends Shield{
    public WoodShield(){
        super("Деревянный щит");

    }
    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(this.name)
                .append(String.format("\n\t%s", super.toString()));
        return res.toString();
    }

    @Override
    public int armor() {
        return 50;
    }
}
