package javaapplication19;

/**
 *
 * @author Mehmed Emirhan AMAÇ
 */


class Spider extends Animal{

    public Spider() {
        super(8);
    }

    @Override
    void eat() {
        System.out.println("Orumcek yedi.");
    }

    @Override
    void walk() {
        System.out.println("Orumcek yurudu");
    }
    

}
public abstract class Animal {
    protected int legs;
    protected Animal(int legs) {
        this.legs = legs;
    }
    abstract void eat();
    abstract void walk();
    
}
