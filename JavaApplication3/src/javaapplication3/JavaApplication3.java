package javaapplication3;
import java.util.Random;

/**
 *Monte Carlo deneyi
 * Rasgele cekilen 4 sayidan birinin gelme olasiligi
 * @author Mehmed Emirhan AMAÇ
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        int a = r.nextInt(4);
        int deneme = 1;
        int dogru = 1;
        while (deneme < 3000) {
            a = r.nextInt(4);
            deneme++;
            if (a == 2) {
                dogru++;
            }

            System.out.println(deneme+" kere denendi 2 gelme olasılıgı %" + (float) (dogru * 100) / deneme);

        }

    }

}
