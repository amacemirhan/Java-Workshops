/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.util.Scanner;

/**
 *
 * @author Mehmed Emirhan AMAÇ 190202050
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sayac = 0;
        String metin;
        String sesliler ="aeiou";
        Scanner scan = new Scanner(System.in);
        System.out.println("Metni giriniz:");
        metin = scan.nextLine();

        for (int i = 0; i <= metin.length() - 1; i++) {
            for (int j = 0; j <= 7; j++) {
                if (metin.charAt(i) == sesliler.charAt(j)) {
                    continue;
                }else
                    System.out.printf("%c",metin.charAt(i));

            }

        }

        
    



}
    }
    

