package javaapplication14;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Mehmed Emirhan AMAÇ
 */
public class birinci_odev_v4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList ls =new ArrayList();
        Scanner sc=new Scanner(System.in);
        System.out.println("10 adet tam sayi giriniz.");
        int j;
        for (int i = 0; i < 10; i++) {
           j=sc.nextInt();
           ls.add(j);
        }
        removeDuplicate(ls);
    }
    public static void removeDuplicate(ArrayList ls){
        System.out.println("Ayni olanlar cikarildi:");
        for (int i = 0; i < ls.size(); i++) {
            for (int j = i+1; j < ls.size(); j++) {
                if(ls.get(i)==ls.get(j)){
                    ls.remove(j);
                    j--;
                }
            }
            System.out.print(ls.get(i)+" ");
            
        }
        System.out.println("");
    }
    
}
