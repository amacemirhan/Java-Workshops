package javaapplication17;

import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author Mehmed Emirhan AMAÇ
 * 170420517
 * Odev 5.2
 * Vektor vs Arraylist
 */
public class ikinci_odev_v5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList ar=new ArrayList();
        Vector<Integer> vc=new Vector();
        System.out.println(vc.capacity());//baslarken boyutu 10 dan basliyo
        System.out.println(ar.size());//baslarken boyutu 0 dan basliyo daha dinamik
        for (int i = 0; i < 11; i++) {
            vc.add(i);
            ar.add(i);
        }
        System.out.println(vc.capacity());//%100 yani 10 eklendi
        System.out.println(ar.size());//aslinda kapasitesi 15 ancak içi dolu olmayan
        //degerleri saymiyor
    }
    
}
