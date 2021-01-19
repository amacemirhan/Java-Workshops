package javaapplication19;

/**
 *
 * @author Mehmed Emirhan AMAÇ
 */
public class TestAnimals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fish d=new Fish();
        Cat c=new Cat("Fluffy");
        Animal a=new Fish();
        Animal e=new Spider();
        
        d.eat();
        d.walk();
        c.eat();
        c.walk();
        a.eat();
        a.walk();
    }
    
}
