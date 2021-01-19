package javaapplication16;

import java.util.Date;

/**
 *
 * @author Mehmed Emirhan AMAÇ
 * 170420517
 * Odev 5.1 in Kisi sinifindan Ogrenci ve Personel alt siniflari
 * Personel sinifindan Idari ve Akademik al siniflari
 */
class Akademik extends Personel{
    private String OfisSaati;
    private String Unvan;

    public Akademik(String OfisSaati, String Unvan) {//Method Overloading
        this.OfisSaati = OfisSaati;
        this.Unvan = Unvan;
    }

    public Akademik(String ad, String adres, String tel, String eposta, String ofisNo,String OfisSaati, String Unvan) {
        super(ad, adres, tel, eposta, ofisNo);
        this.OfisSaati = OfisSaati;
        this.Unvan = Unvan;
    }

    public String getOfisSaati() {
        return OfisSaati;
    }

    public void setOfisSaati(String OfisSaati) {
        this.OfisSaati = OfisSaati;
    }

    public String getUnvan() {
        return Unvan;
    }

    public void setUnvan(String Unvan) {
        this.Unvan = Unvan;
    }

    @Override
    public String toString() {//Overriding
        return super.toString()+", Ofis Saati=" + OfisSaati + ", Unvani=" + Unvan;
    }
    
    
    

}
class Idari extends Personel{
    private String birim;

    public Idari(String birim) {//Constructor
        this.birim = birim;
    }

    public Idari(String ad, String adres, String tel, String eposta, String ofisNo,String birim) {
        super(ad, adres, tel, eposta, ofisNo);
        this.birim = birim;
    }

    public String getBirim() {
        return birim;
    }

    public void setBirim(String birim) {
        this.birim = birim;
    }

    @Override
    public String toString() {
        return super.toString()+", birimi=" + birim;
    }
    
    
    

}
class Personel extends Kisi{
    private String ofisNo;
    private int maas=5000;
    private Date ise_alim_tar=new Date();

    public Personel() {
    }

    public Personel(String ad, String adres, String tel, String eposta,String ofisNo) {
        super(ad, adres, tel, eposta);
        this.ofisNo=ofisNo;
    }

    public String getOfisNo() {
        return ofisNo;
    }

    public void setOfisNo(String ofisNo) {
        this.ofisNo = ofisNo;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public Date getIse_alim_tar() {
        return ise_alim_tar;
    }

    @Override
    public String toString() {
        return super.toString()+", ofis numarasi=" + ofisNo + ", maasi=" + maas + ", ise alim tarihi=" + ise_alim_tar;
    }

}
class Ogrenci extends Kisi{
    private String durum;
    public Ogrenci(String ad,String adres,String tel,String eposta,String durum){
        super(ad,adres,tel,eposta);
        this.durum=durum;
    }

    public String getDurum() {
        return durum;
    }

    public void setDurum(String durum) {
        this.durum = durum;
    }

    @Override
    public String toString() {
        return super.toString()+", durumu=" + durum;
    }
    
    
    

}
public class Kisi {
    private String ad;
    private String adres;
    private String tel;
    private String eposta;
    public Kisi(){
    }
    public Kisi(String ad,String adres,String tel,String eposta){
        this.ad=ad;
        this.adres=adres;
        this.eposta=eposta;
        this.tel=tel;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEposta() {
        return eposta;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }

    @Override
    public String toString() {
        return "adi=" + ad + ", adresi=" + adres + ", telefonu=" + tel + ", e postasi=" + eposta;
    }
    
    
    
    
}
