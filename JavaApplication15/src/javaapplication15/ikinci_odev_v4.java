package javaapplication15;

/**
 *
 * @author Mehmed Emirhan AMAÇ
 * 170420517
 * odev 4.2
 * Test Classim burada
 */
public class ikinci_odev_v4 {
    public static void main(String[] args){
    VeriDeposu banka=new VeriDeposu();
    VipHesap vp=new VipHesap("melih abaci",123456,950000.0);
            vp.paraCekme(2000.0);
            vp.yazdir();
    Hesap hs=new Hesap("murat yagci",11112222,2000.0);
    banka.hesap_add(hs);
    banka.hesap_add(vp);
    banka.print(hs);
    
    }
    
}
