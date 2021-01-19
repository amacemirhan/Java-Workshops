package javaapplication5;

import java.util.Scanner;

/**
 * Duzgun besgenin yaricapindan alani hesaplama
 *
 * @author Mehmed Emirhan AMAÇ
 */
public class dorduncu_odev {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Besgenin yaricapini giriniz:");
        Scanner s = new Scanner(System.in);
        double a = s.nextDouble();
        System.out.println("Besgenin alani:" + ((5.0 / 2.0) * a * a * Math.sin(1.25)));
  

    }

}
