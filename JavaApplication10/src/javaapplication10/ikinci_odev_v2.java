package javaapplication10;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Mehmed Emirhan AMAÇ Seçmeli sıralama (Selection sort) ve
 * Yerleştirmeli sıralama (insertion sort) işlemlerini metot kullanarak
 * gerçekleştiriniz. 100 elemanlı rastgele sayılardan oluşan bir diziniz olsun.
 * Hangi sıralama metodu seçildiyse ilgili sıralama yöntemine göre metotta
 * sıralama gerçekleşsin. Sıralanmış dizi ana programda yazdırılsın.
 */
public class ikinci_odev_v2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        int dizi[] = new int[100];
        for (int i = 0; i < 100; i++) {
            dizi[i] = r.nextInt(150);

        }
        PrintArray(dizi);
        System.out.println("Dizi Hangi yöntemle siralansin (Selection:s,Insertion:i)");
        String q = s.next();
        if (null == q) {
            System.out.println("Yanlis ifade girdiniz.");
        } else switch (q) {
            case "i":
                InsertionSort(dizi);
                System.out.println("Insertion Sort İle Siralandi.");
                PrintArray(dizi);
                break;
            case "s":
                SelectionSort(dizi);
                System.out.println("Selection Sort İle Siralandi.");
                PrintArray(dizi);
                break;
            default:
                System.out.println("Yanlis ifade girdiniz.");
                break;
        }

    }

    public static int[] SelectionSort(int a[]) {
        int min;
        int temp;
        for (int i = 0; i < a.length - 1; i++) {
            min = i;
            for (int j = i; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }

            }
            temp = a[i];
            a[i] = a[min];
            a[min] = temp;

        }
        return a;
    }

    public static int[] InsertionSort(int a[]) {
        int temp;
        for (int i = 1; i < a.length; i++) {
            int j = i;
            while (j > 0 && a[j] <= a[j - 1]) {
                temp = a[j - 1];
                a[j - 1] = a[j];
                a[j] = temp;
                j = j - 1;
            }

        }
        return a;
    }

    public static void PrintArray(int dizi[]) {
        System.out.println("Dizi:");
        for (int j = 0; j < dizi.length; j++) {
            System.out.print(dizi[j] + " ");
            if (j % 15 == 14) {
                System.out.println("");
            }
        }
        System.out.println("");
    }
}
