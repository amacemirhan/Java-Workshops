package javaapplication16;

/**
 *
 * @author Mehmed Emirhan AMAÇ
 * 170420517
 * Odev 5.1
 */
public class birinci_odev_v5 {
    public static void print(Kisi person){
        System.out.println(person);
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//Polymorphism burda
        Kisi kisi=new Ogrenci("Mehmed Emirhan Amac","Zeytinburnu","05524365382","emirhan_amac01@hotmail.com","2.Sinif");
        System.out.println(kisi.getAd());
        print(new Idari("Eyup Emre Ulku","Uskudar","055544433322","emre.ulku@marmara.edu.tr","B105","Danisman"));
        print(kisi);
       
    }
    
}
