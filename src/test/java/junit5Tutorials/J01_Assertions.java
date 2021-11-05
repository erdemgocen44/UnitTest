package junit5Tutorials;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

public class J01_Assertions {

    @Test
    @DisplayName("ToAssert Testi")
    void testToAssert(){
        int actual="Hakan".length();//5
        int expected=5;

        //1. assertEquals(); --> expected ve actual degerlerinin esit olma durumunda test Passed olur
        assertEquals(expected,actual,"beklenen ve aktuel deger esit degil"); //hata verince bu mesaj gorunecek

        //inLine style: her zaman kullanilmaz, simple test'e aykiridir. Code okunabilirligi acisindan tavsiye edilmez
        assertEquals(5,"Hakan".length(),"bu yontem cok kullanilmaz");

        //2. assertNotEquals(); --> expected ve actual degerlerinin esit olmama durumunda test Passed olur
        expected=4;
        assertNotEquals(expected,actual,"beklenen ve aktuel deger esit");

        //3. assertTrue(); --> olusturulan sart (boolean) true ise test Passed
        expected=5;
        assertTrue(expected==actual, "sart saglanmadi false deger verdi");

        //4. assertFalse(); --> olusturulan sart (boolean) false ise test Passed
        expected=5;
        assertFalse(expected!=actual, "sart saglandi ve true deger verdi");


    }

    @Test
    @DisplayName("ToConvertUpper Testi")
    void testToConvertUpper(){
        String expected="BASRİ";
        String actual="basri".toUpperCase();

        assertEquals(actual,expected); //test data esitse passed
        assertTrue(actual.equals(expected)); //test data true ise passed
        assertFalse(!actual.equals(expected));

        actual=null;
        assertNull(actual,"actual deger null degil"); //parametre null ise Passed

        //assertNotNull(actual, "actual deger null"); -->failed
        actual="kenan";
        assertNotNull(actual, "actual deger null");
    }

    @Test
    @DisplayName("ToContain Testi")
    void testToContain(){
        boolean actual="erdem".contains("hi"); //false
        boolean expected=false;

        assertEquals(actual,expected, "degerler esit degil"); //actual=false, expected=false --> actual=expected (Passed)
    }

    @Test
    @DisplayName("Arrays Testi")
    void testWithArrays(){
        String str="junit ile ebik gabik testler";
        String actual[]=str.split(" "); //{"junit", "ile", "ebik", "gabik","testler"}
        //String expected[]={"junit", "ile", "ebik", "gabik","testler"};
        String expected[]={"junit", "ile", "ebik", "gabik","testler"};

        assertArrayEquals(expected, actual,"arrayler esit degil");

    }
}
