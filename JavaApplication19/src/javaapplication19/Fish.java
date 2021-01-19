package javaapplication19;

/**
 *
 * @author Mehmed Emirhan AMAÇ
 */
public class Fish extends Animal{

    public Fish() {
        super(0);
    }
    
    @Override
    void eat() {
        System.out.println("Balik yedi.");
    }

    @Override
    void walk() {
        System.out.println("Balik kosamadi cunku ayagi yok :(");
    }

}
