package DepoProjeCalismasi;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class UrunListesi {

    static Scanner input = new Scanner(System.in);

    public static void urunListe() {

        System.err.println("\t\t\t\t\t\t\t\t# URUN LİSTESİ #");

        System.out.println("--------------------------------------------------------------------------------------------------------------");
        System.out.println("\tID\t\t\tİSİM\t\t\tURETİCİ\t\t\tBİRİM\t\t\t\tRAF\t\t\t\t\t\tMİKTAR");
        System.out.println("--------------------------------------------------------------------------------------------------------------");

        Map<Integer, UrunTanimlama> urunler = UrunTanimlama.urunListesiOlustur();

        Set<Map.Entry<Integer, UrunTanimlama>> urunlerSet = urunler.entrySet();

        for (Map.Entry<Integer, UrunTanimlama> urun : urunlerSet) {

            System.out.print("\t" + urun.getKey() + "" + urun.getValue() + "\n");

        }
        DepoKarsilama.depoKarsilamaSayfasi();
    }
}
