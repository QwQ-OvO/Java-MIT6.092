package Lec7.Inheritance;

import java.util.ArrayList;

/**
 * Wizard is a subclass of Dude
 * Wizard can use everything* the Dude has
 * Wizard can do everything* Dude can do
 * Can use a Wizard like a Dude too
 * except for private fields and methods
 */
public class Wizard extends Dude {
    ArrayList<Spell> spells;

    public Wizard(String name) {
        super(name);
    }

    public void learnSpell(Spell spell) {
        spells.add(spell);
        System.out.println(name + " learned the spell: " + spell.getName());
    }

    public void cast(String spellName) {
        for (Spell spell : spells) {
            if (spell.getName().equals(spellName)) {
                if (mp >= spell.getManaCost()) {
                    System.out.println(name + "cast" + spellName + "!");
                    mp -= spell.manaCost;
                } else {
                    System.out.println("Not enough mana to cast" + spellName);
                }
            }
        }
        System.out.println(name + "doesn't know the spell" + spellName);
    }

}
