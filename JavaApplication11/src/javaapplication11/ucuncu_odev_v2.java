package javaapplication11;

import java.util.Random;

/**
 *
 * @author Mehmed Emirhan AMAÇ Birbirine En Yakın İki Noktayı Bulma; iki boyutlu
 * bir dizide noktalarinizi tutunuz (x,y). Noktalarin olusturulmasi rastgele ya
 * da klavyeden olabilir. Daha sonra girilen noktalardan birbirine en yakın iki
 * noktayi bulun programi yazınız.
 */
public class ucuncu_odev_v2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        int dots[][] = new int[5][2];
        System.out.println("Noktalar:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                dots[i][j] = r.nextInt(15);
                System.out.print(dots[i][j] + " ");
            }
            System.out.println("");

        }
        float min = 10000;
        int mini = 0;
        int minj = 0;
        float temp;
        for (int i = 0; i < dots.length; i++) {
            for (int j = i + 1; j < dots.length; j++) {
                temp = Distance(dots[i][0], dots[i][1], dots[j][0], dots[j][1]);
                if (temp < min) {
                    min = temp;
                    mini = i;
                    minj = j;
                }

            }

        }
        System.out.printf("Birbirine en yakin iki nokta:%d %d noktasi ile %d %d "
            + "noktasi\n", dots[mini][0], dots[mini][1], dots[minj][0], dots[minj][1]);

    }

    public static float Distance(int x1, int y1, int x2, int y2) {
        return (float) Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }

}
