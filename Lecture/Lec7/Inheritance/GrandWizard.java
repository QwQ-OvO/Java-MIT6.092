package Lec7.Inheritance;

public class GrandWizard extends Wizard {

    public GrandWizard(String name) {
        super(name);
    }

    public void sayName() {
        System.out.println("Grand wizard " + name);
    }
}
