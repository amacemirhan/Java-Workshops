package javaapplication19;

/**
 *
 * @author Mehmed Emirhan AMAÇ
 */
public class Cat extends Animal implements Pet{
    String name="kedi";
    public Cat() {
        super(4);
    }
    public Cat(String name) {
        super(4);
        this.name=name;
        
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String a) {
        name=a;
    }

    @Override
    public void play() {
        System.out.println(name+" oynuyor.");
    }

    @Override
    void eat() {
        System.out.println(name+" yedi.");
    }

    @Override
    void walk() {
        System.out.println(name+" yurudu.");
    }
    
}
