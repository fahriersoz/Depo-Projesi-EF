package DepoProjeCalismasi;

import java.util.Scanner;

public class DepoKarsilama extends DepoUrunListesi {

    static Scanner input = new Scanner(System.in);

    public static void depoKarsilamaSayfasi() {

        System.err.println("#  DEPO ANASAYFA  #");

       // System.out.println(" 1. Urun Tanimlama\n" + " 2. Urun Rafa Koy\n" + " 3. Urun Giris\n" + " 4. Urun Cikis\n" + " 5. Urun Listesi\n" + " 6. Cıkıs\n" + "Yapmak istediginiz islemin numarasini giriniz: ");


        int secim = input.nextInt();

        switch (secim) {
            case 1:
                UrunTanimlama.urunBilgileriAl();
                break;
            case 2:
                RafaUrunKoyma.urunRafaKoy();
                break;
            case 3:
                YeniUrunGiris.urunGirisi();
                break;
            case 4:
                UrunCikis.urunCikisi();
                break;
            case 5:
                UrunListesi.urunListe();
                break;
            case 6:
                System.exit(0);
            default:
                System.err.println("Gecerli Bir Secim Yapiniz !");
                depoKarsilamaSayfasi();
                break;

        }


 }

}

