package Lec7;

public class Dude {
    public String name;
    public int hp = 100;
    public int mp = 0;

    public Dude (String name) {
        this.name = name;
        this.hp = 100;
        this.mp = 0;
    }

    public void sayName() {
        System.out.println(name);
    }

    public void punchFace(Dude target) {
        target.hp -= 10;
    }
}
