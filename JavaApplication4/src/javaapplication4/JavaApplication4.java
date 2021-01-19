/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Scanner;

/**
 *
 * @author Mehmed Emirhan AMAÇ
 * 190202050
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // calisma-1.1
        System.out.println("Lütfen üssü alınacak değeri giriniz.");
        Scanner s=new Scanner (System.in);
        int x=s.nextInt();
        System.out.println("Lütfen üs değerini giriniz.");
        int k=s.nextInt();
        System.out.println((int)(Math.pow(x, k)));
        //calisma-1.2
        /*
        hocam bunu import edince calismiyor -> import static jdk.vm.ci.meta.JavaKind.Int;
        System.out.println("Lütfen üssü alınacak değeri giriniz.");
        int y=Integer.parseInt(args[0]);
        int z=Integer.parseInt(args[1]);
        System.out.println((Math.pow(y, z)));
        */
        // calisma-2
        System.out.println("Lütfen bir değer giriniz:");
        Scanner a=new Scanner (System.in);
        int num=a.nextInt();
        int kalan=0;
        while(num % 5 == 2 ||num % 5 ==1){
            kalan--;
            num--;
        }
        while(num % 5 > 2){
            kalan++;
            num++;
        }
        int sayac=0;
        while(num !=0){
        if(num >= 50){
        num=num-50;
        sayac++;}
        else if(num >=25 && num < 50){
        num=num-25;
        sayac++;}
        else if(num >=10 && num < 25){
        num=num-10;
        sayac++;}
        else if(num >=5 && num < 10){
        num=num-5;
        sayac++;}
        }
        if(kalan==0)
            System.out.printf("%d kağıt para",sayac);
        else if(kalan<0)
        System.out.printf("%d kağıt para – %d TL nizi yedim : )",sayac,Math.abs(kalan));
        else
            System.out.printf("%d kağıt para – %d TL mi yediniz :( ",sayac,kalan);
        
    }
    
}
