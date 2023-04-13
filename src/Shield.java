public abstract class Shield implements Armor {
    String name;



    public Shield(String name) {
        this.name = name;

    }


    @Override
    public String toString() {
        return String.format(("%s \n    Прочность : %d"), name, this.armor());
    }
}
