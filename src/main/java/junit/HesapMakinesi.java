package junit;

import java.util.stream.DoubleStream;

public class HesapMakinesi {

    static double topla(double... sayilar){

        return DoubleStream.of(sayilar).sum();
    }
    static double carp(double... sayilar){

        return DoubleStream.of(sayilar).reduce(1,(a,b)->a*b);
    }

    public static class C02_StringChange {
        /*
        * verilen bir String deki ilk iki harf A ise bunları silen method create ediniz
        *AACD->CD    ABC->BC    A->""  B->B
        */

        public static String ilkIkiASil(String str) {
            if (str.length() <= 2) {
                return str.replaceAll("A", "");
            }
            String ilkIkiKarakter=str.substring(0,2);//0 dahil 2 dahil değil
            String ilkIkiKarakterSonrasi=str.substring(2);
            return ilkIkiKarakter.replaceAll("A","")+ilkIkiKarakterSonrasi;
            }
    }
}
