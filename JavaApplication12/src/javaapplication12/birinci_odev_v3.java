package javaapplication12;

/**
 *
 * @author Mehmed Emirhan AMAÇ
 * nyp ödev-3.1
 */
class EbookReader {//elektronik kitap okuyucu
    boolean on=false;
    String book;
    int page;//en son nerede kalindigi bilgisi
    int maxpage;
    int brightness=3;
    public EbookReader(){
    }
    public EbookReader(String book,int maxpage){//kitabin adi ve kaç sayfa oldugu
        this.book=book;
        page=1;
        this.maxpage=maxpage;
    }
    public void TurnOn(){
    if(on==false)
        on=true;
    }
    public void TurnOff(){
    if(on==true)
        on=false;
    }
    public void PageUp(){
    if(page<maxpage && on==true)
        page++;
    }
    public void PageDown(){
    if(page>1 && on==true)
        page--;
    }
    public void GoToPage(int newPage){
    if(newPage<maxpage && page!=newPage && on==true)
        page=newPage;
    }
    public void BrightnessOn(){
    if(brightness<10 && on==true)
        brightness++;
    }
    public void BrightnessOff(){
    if(brightness>1 && on==true)
        brightness--;
    }
    
}
class SuSebili {//icindeki litrenin hesabini tutan akilli su sebili
        //su alirken sarjli pompasi var full sarj 20 lt su aldiriyor yani
        //litre basi yuzde 5 sarj gidiyor
        double maxLt= 50.0;
        double currentLt=0.0;
        int charge=100;//baslangicta sarji yuzde yuz
        public SuSebili(){
        }
        public SuSebili(double newLt){//baslarken icinde su varsa lt sini yaziyoruz
            this.currentLt=newLt;
        }
        public void SuEkle(double ek){
            if(currentLt+ek<maxLt){
                currentLt+=ek;
                System.out.println(ek+"lt su sebile eklendi.");
            }
        }
        public void SuAl(double al){
        if(currentLt>al && charge>al*5){
            currentLt-=al;
            charge-=(int)al*5;
            System.out.println(al+"lt lik su sebilden aldiniz afiyet olsun.");
        }
        else if(charge<al*5){
            System.out.println("Yeterli sarj yok sarj ediniz.");
        }
        else
            System.out.println("Yeterli su yok su ekleyin");
        }
        public void SarjEt(){
            charge=100;
            System.out.println("Sarj edildi.");
        }
        
    }
public class birinci_odev_v3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //EbookReader classinin denemesi
        EbookReader eb1=new EbookReader("Suc Ve Ceza",480);
        SuSebili su1=new SuSebili(20.0);
        eb1.TurnOn();
        System.out.println("kitabin adi:"+eb1.book);
        System.out.println(eb1.page+" numarali sayfa acik");
        eb1.GoToPage(153);
        System.out.println(eb1.page+" numarali sayfa acik");
        System.out.println("Parlaklık: "+eb1.brightness);
        eb1.BrightnessOn();
        eb1.BrightnessOn();
        eb1.BrightnessOn();
        System.out.println("Parlaklık: "+eb1.brightness);
        eb1.PageUp();
        System.out.println(eb1.page);
        eb1.PageDown();
        System.out.println(eb1.page);
        eb1.TurnOff();
        //SuSebili classinin denemesi
        System.out.println(su1.currentLt+" lt su bulunuyor,%"+su1.charge+" sarji var.");
        su1.SuAl(8.3);
        System.out.println(su1.currentLt+" lt su bulunuyor,%"+su1.charge+" sarji var.");
        su1.SuEkle(23.4);
        System.out.println(su1.currentLt+" lt su bulunuyor,%"+su1.charge+" sarji var.");
        su1.SuAl(32.8);
        su1.SarjEt();
        System.out.println(su1.currentLt+" lt su bulunuyor,%"+su1.charge+" sarji var.");
        su1.SuAl(6.7);
        System.out.println(su1.currentLt+" lt su bulunuyor,%"+su1.charge+" sarji var.");
    }
    
}
