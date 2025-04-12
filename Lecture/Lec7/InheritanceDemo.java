package Lec7;

import java.util.ArrayList;

/**
 * class A extends B {} == A is a subclass of B
 * A has all the fields and methods that B has
 * A can add it’s own fields and methods
 * A can only have 1 parent
 * A can replace a parent’s method by re-implementing it
 * If A doesn’t implement something Java searches ancestors
 *
 * Java面向对象编程中的重要概念：
 *
 * 继承（一个类继承另一个类的属性和方法）
 * 方法覆盖（子类可以提供父类方法的新实现）
 * 向上转型（子类对象可以被视为父类类型）
 * 动态绑定（方法调用基于对象的实际类型，而不是引用类型）
 */
public class InheritanceDemo {

    public static void main(String[] args) {

        Dude dude1 = new Dude("Aragorn");
        Wizard wizard1 = new Wizard("Saruman");
        ArrayList<Spell> spells = new ArrayList<>();
        GrandWizard grandWizard1 = new GrandWizard("Gandalf");

        /**
         * Wizard可以使用Dude拥有的一切
         * Wizard对象可以访问和修改从Dude类继承来的属性，这里是增加生命值(hp)。
         * 这说明子类(Wizard)继承了父类(Dude)的属性
         */
        wizard1.hp += 10;

        /**
         * Wizard可以做Dude能做的一切
         * Wizard对象可以调用从Dude类继承的方法，这里是punchFace方法（打脸）。
         * 这说明子类(Wizard)继承了父类(Dude)的方法
         */
        wizard1.punchFace(dude1);

        /**
         * 可以像使用Dude一样使用Wizard
         * 多态性：Dude类的方法可以接受Wizard类的对象作为参数。
         * 这表明在面向对象设计中，子类对象可以在需要父类对象的地方使用（向上转型）
         */
        dude1.punchFace(wizard1);

        grandWizard1.sayName();
        /**
         * 将grandWizard1对象强制转型为Dude类型，然后调用sayName()方法
         * 如果 Dude类中有sayName()方法，
         * 而且该方法没有被Wizard或GrandWizard覆盖（或者方法是static的），
         * 那么会调用Dude类的sayName()方法
         *
         * 如果Dude类中有sayName()方法，但该方法被子类覆盖了，
         * 并且Java使用动态绑定（这是Java的默认行为），那么即使引用类型是Dude，
         * 实际上仍然会调用对象实际类型(GrandWizard)的sayName()方法
         *
         * 此处调用的sayName()方法仍然是GrandWizard中定义的版本
         */
        ((Dude)grandWizard1).sayName();

        grandWizard1.punchFace(dude1);
    }
}

/**
 * 更多参考资料：
 * https://en.wikipedia.org/wiki/Inheritance_(object-oriented_programming
 * https://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html
 */


