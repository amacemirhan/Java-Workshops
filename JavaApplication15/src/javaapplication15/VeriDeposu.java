package javaapplication15;

import java.util.ArrayList;

/**
 *
 * @author Mehmed Emirhan AMAÇ
 */
public class VeriDeposu{
    ArrayList<Hesap> veriler=new ArrayList();
    void hesap_add(Hesap h){
        veriler.add(h);
    
    }
    void print(Hesap h){
        h.yazdir();
    }
    void search(String OwnerName){
        boolean state=true;
        for (int i = 0; i < veriler.size(); i++) {
            if(veriler.get(i).getOwner().equals(OwnerName)){
            print(veriler.get(i));
            state=false;
            }
            
        }
        if(state)
            System.out.println("Hesap bulunamadi");
    }
}
