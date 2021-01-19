package javaapplication6;

import java.util.Scanner;

/**
 *
 * @author Mehmed Emirhan AMAÇ
 * Dunyada enlem ve boylami verilen iki nokta arasindaki
 * uzakligi bulan program
 */
public class besinci_odev {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        System.out.println("Nokta1 in enlem ve boylamini derece olarak giriniz:(orn:39,55 -116,25)");
        double x1=s.nextDouble();
        double y1=s.nextDouble();
        System.out.println("Nokta2 nin enlem ve boylamini derece olarak giriniz:");
        double x2=s.nextDouble();
        double y2=s.nextDouble();
         double d = 6371.01 * Math.acos((
            Math.sin(Math.toRadians(x1)) *
            Math.sin(Math.toRadians(x2))) +
            (Math.cos(Math.toRadians(x1)) * 
            Math.cos(Math.toRadians(x2)) * 
            Math.cos(Math.toRadians(y1) - Math.toRadians(y2))));
        System.out.println("İki nokta arasindaki mesafe "+d+" km’dir.");
        
                
        

    }
    
}
