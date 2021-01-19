package javaapplication9;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Mehmed Emirhan AMAÇ 
 * Rasgele türerilen sayılardan oluşan 100 elemanı
 * bir dizide doğrusal arama ve ikili arama işlemlerini metot kullanarak
 * gerçekleştiriniz. (Kullanıcıdan alınan değer dizide aranacak.) Her iki arama
 * yöntemi için ayrı metotlar oluşturun.
 */

public class birinci_odev_v2 {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        Random r=new Random();
        Scanner s=new Scanner(System.in);
        int dizi[]=new int[100];
        for (int i = 0; i < 100; i++) {
            dizi[i]=r.nextInt(150);
            
        }
        System.out.println("Dizinin içinde aramak istediginiz sayi:");
        int aranan=s.nextInt();
        PrintArray(dizi);
        if(LinearSearch(dizi,aranan)==1)
        System.out.println("Doğrusal Arama Kullanildi Sonuc:Dizide var");
        else
        System.out.println("Doğrusal Arama Kullanildi Sonuc:Dizide yok");
        
        System.out.println("Dizi sıralanadı.");
        SelectionSort(dizi);
        PrintArray(dizi);
        if(BinarySearch(dizi,aranan)==1)
        System.out.println("Ikili Arama Kullanildi Sonuc:Dizide var");
        else
        System.out.println("Ikili Arama Kullanildi Sonuc:Dizide yok");
    }
    public static int LinearSearch(int a[],int snum){
        for (int i = 0; i < a.length; i++) {
            if(snum==a[i])
                return 1;
            
        }
        return 0;
 
    }
    public static int BinarySearch(int a[],int snum){
        int max=a.length+1;
        int min=-1;
        while(max-min>1){
            if(a[(max+min)/2]==snum)
            return 1;
            else if(a[(max+min)/2]>snum)
                max=(max+min)/2;
            else
                min=(max+min)/2;
            
        }
        return 0;
    }
    public static int [] SelectionSort(int a[]){
        int min;
        int temp;
        for (int i = 0; i < a.length-1; i++) {
            min=i;
            for (int j = i; j < a.length; j++) {
                if(a[j]<a[min])
                    min=j;
                
            }
            temp=a[i];
            a[i]=a[min];
            a[min]=temp;
            
        }
        return a;
    }
    public static void PrintArray(int dizi[]){
        System.out.println("Dizi:");
        for (int j = 0; j < dizi.length; j++) {
            System.out.print(dizi[j]+" ");
            if (j%15==14)
                System.out.println("");
        }
        System.out.println("");
    }
}
