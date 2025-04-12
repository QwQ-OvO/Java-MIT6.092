package Lec7.Inheritance;

public class Spell {

    String name;
    int manaCost;

    public Spell(String name, int manaCost) {
        this.name = name;
        this.manaCost = manaCost;
    }

    public String getName() {
        return name;
    }

    public int getManaCost() {
        return manaCost;
    }

    public void effect(Dude target) {
        System.out.println("Casting " + name + " on " + target.name);
        target.hp -= 20;
    }
}
