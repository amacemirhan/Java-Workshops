package javaapplication7;

/**
 *
 * @author Mehmed Emirhan AMAÇ
 * Merkezi (0, 0) ve yarıçapı 40 olan bir çember üzerinde üç tane rastgele 
 * nokta üretiniz ve Şekil Ek3 a’daki gibi bu noktaların oluşturduğu üçgenin 
 * açılarını gösteriniz.
 */
public class altinci_odev {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
		final double r = 40;
		// 2 pi ve sıfır arasinda radyan cinsinden resgele aci uretme
		double ang1 = (Math.random() * (2 * Math.PI));
		double ang2 = (Math.random() * (2 * Math.PI));
		double ang3 = (Math.random() * (2 * Math.PI));

		// noktalarin koordinatlarini olusturmak
		double x1 = r * Math.cos(ang1);
		double y1 = r * Math.sin(ang1);
		double x2 = r * Math.cos(ang2);
		double y2 = r * Math.sin(ang2);
		double x3 = r * Math.cos(ang3);
		double y3 = r * Math.sin(ang3);

		// ucgenin kenarlarini hesapla
		double a = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
		double b = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
		double c = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

		// uc aciyi hesaplamak
		double angA = Math.toDegrees(Math.acos((a * a - b * b - c * c)
			/ (-2 * b * c)));
		double angB = Math.toDegrees(Math.acos((b * b - a * a - c * c)
			/ (-2 * a * c)));
		double angC = Math.toDegrees(Math.acos((c * c - b * b - a * a)
			/ (-2 * a * b)));

		// sonuclari yazdirma
		System.out.println("Cember uzerindeki ucgenin acilari " +
			Math.round(angA * 100) / 100.0 + "," +
			Math.round(angB * 100) / 100.0 + "," +
			Math.round(angC * 100) / 100.0);
                //saglamasi
                System.out.println("Ucgenin acilari toplami her zaman "+
                        (Math.round(angA * 100) / 100.0 +
			Math.round(angB * 100) / 100.0 +
			Math.round(angC * 100) / 100.0)+" dir");
                
	}
    
}
