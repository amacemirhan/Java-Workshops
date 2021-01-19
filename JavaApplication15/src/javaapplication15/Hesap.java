package javaapplication15;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Mehmed Emirhan AMAÇ
 * 170420517
 * odev 4.2
 */

class VipHesap extends Hesap{
    
    public VipHesap(String Owner,int newId,double newBakiye){
        super(Owner,newId,newBakiye);
        this.faizOraniYillik=6.0;
        this.maxIslem=5000.0;
    }
    
}
public class Hesap{
    private String Owner;
    private int id=0;
    private double bakiye=0.0;
    protected double faizOraniYillik=4.5;//protected olarak degistirdim cunku alt siniftan ulasmak istiyorum
    protected double maxIslem=1000.0; //normal hesapta günlük max işlem yapılabilen miktar
    private Date hesapAcilmaTarihi=new Date();
    public Hesap(){
    } 
    public Hesap(int newId,double newBakiye){//bu ve altindaki constructor üzerinde method overloading
        id=newId;
        bakiye=newBakiye;
    }
    public Hesap(String Owner,int newId,double newBakiye){
        this.Owner=Owner;
        id=newId;
        bakiye=newBakiye;
    }
    //id, bakiye ve faizOraniYillik için erişimci ve mutatör (get/set) yöntemleri.
    // hesapAcilmaTarihi için erişimci (get) yöntemi.
    public String getOwner(){
        return Owner;
    }
    public void setOwner(String Owner){
        this.Owner=Owner;
    }
    public void getId(){
        System.out.println(id);
    }
    public void setId(int id){
        this.id=id;
    }
    public void getBakiye(){
        System.out.println(bakiye);
    }
    public void setBakiye(double bakiye){
        this.bakiye=bakiye;
    }
    public void getFaizOraniYillik(){
        System.out.println(faizOraniYillik);
    }
    public void setFaizOraniYillik(double faizOraniYillik){
        this.faizOraniYillik=faizOraniYillik;
    }
    public void getHesapAcilmaTarihi(){
        System.out.println(hesapAcilmaTarihi.toString());
    }
    //erisimci ve mutator fonksiyonlarin sonu
    public double getAylikFaizOrani(){
    return (faizOraniYillik/100)/12;
    }
    public double getAylikFaiz(){
    return bakiye*getAylikFaizOrani();
    }
    public void paraCekme(double istenen){
        if(bakiye>=istenen && istenen<=maxIslem){
            bakiye-=istenen;
            maxIslem-=istenen;
            System.out.println("Hesaptan "+istenen+" tl para çekildi.");
        }
        else if(bakiye>=istenen && istenen>maxIslem){
            System.out.println("Gunluk maximum islem miktarini gectiniz.");
        }
        else
            System.out.println("Yeterli bakiyeniz bulunmamaktadır.");
                    
    
    }
    public void paraYatir(double yatir){
    bakiye+=yatir;
        System.out.println("Hesaba "+yatir+" tl yatirildi.");
    }
    public void yazdir(){
        System.out.printf("""
                          
                          Hesap bilgileri:
                          Hesap sahibi: %s
                          Hesap id: %d
                          Hesap bakiyesi:%.2f
                          Hesap acilma tarihi:"""+hesapAcilmaTarihi.toString()+"\n",Owner,id,bakiye);
    }
    
}
