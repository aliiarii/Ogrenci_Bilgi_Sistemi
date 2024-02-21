public class sonuclar extends ogrenciManager {

    public void sonuc() {
        double canNot=can();
        for (int i = 0; i < ogr.length; i++) {
            if ( vize[i] * 0.4 + finalL[i] * 0.6 > 60) {
                System.out.println(ogr[i] + " :Dersi geçmiştir");
            } else if ( vize[i] * 0.4 + finalL[i] * 0.6> canNot) {
                System.out.println(ogr[i] + " :Çanla Dersi geçmiştir");
            } else System.out.println(ogr[i] + " :Dersi geçememiştir");
        }
    }
    private double can() {
        int canHesap = -10;
        double toplam = 0;
        for (int i = 0; i < ogr.length; i++) {
            toplam += vize[i] * 0.4 + finalL[i] * 0.6;
        }
        canHesap += toplam / ogr.length;
        System.out.println("Çan Ortalaması: " + canHesap);
        return canHesap;
    }


}


