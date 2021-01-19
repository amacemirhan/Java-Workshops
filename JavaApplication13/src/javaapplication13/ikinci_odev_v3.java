package javaapplication13;
import java.util.Date;

/**
 *
 * @author Mehmed Emirhan AMAÇ
 */
class Hesap{
    private int id=0;
    private double bakiye=0.0;
    private double faizOraniYillik=0.0;
    private Date hesapAcilmaTarihi=new Date();
    public Hesap(){
    } 
    public Hesap(int newId,double newBakiye,double newfaizOraniYillik){
        id=newId;
        bakiye=newBakiye;
        faizOraniYillik=newfaizOraniYillik;
    }
    public double getAylikFaizOrani(){
    return (faizOraniYillik/100)/12;
    }
    public double getAylikFaiz(){
    return bakiye*getAylikFaizOrani();
    }
    public void paraCekme(double istenen){
        if(bakiye>=istenen){
            bakiye-=istenen;
            System.out.println("Hesaptan "+istenen+" tl para çekildi.");
        }
        else
            System.out.println("Yeterli bakiyeniz bulunmamaktadır.");
                    
    
    }
    public void paraYatir(double yatir){
    bakiye+=yatir;
        System.out.println("Hesaba "+yatir+" tl yatirildi.");
    }
    public void yazdir(){
        System.out.printf("Hesap bilgileri:\nHesap id: %d\nHesap bakiyesi:%.2f\n"
                + "Hesap acilma tarihi:"+hesapAcilmaTarihi.toString()+"\n",id,bakiye);
    }
    
}
public class ikinci_odev_v3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hesap hesap1=new Hesap(112233,20000.0,4.5);
        hesap1.paraCekme(300.2);
        hesap1.paraYatir(20.3);
        hesap1.yazdir();
        
    }
    
    
}
