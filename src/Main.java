public class Main {
    public static void main(String[] args) {
        team<Archer> archer = new team<>();
        team<Thief> thiefteam = new team<>();
        archer.addPers(new Archer("Робин", 100,new IronShield(), new Bow(20)))
                .addPers(new Archer("Леголас", 100,new WoodShield(), new Bow(15)));
        thiefteam.addPers(new Thief("Слон", 150,new IronShield(), new Knife()))
                .addPers(new Thief("Паук", 150,new WoodShield(), new Knife()));

        System.out.println(archer);
        System.out.println();
        System.out.println(thiefteam);
        Archer robin = new Archer("Робин", 100,new IronShield(), new Bow(20));
        Archer legolas = new Archer("Леголас", 50,new WoodShield(), new Bow(50));
        Battle fight = new Battle(robin,legolas);
        fight.run();



    }
}