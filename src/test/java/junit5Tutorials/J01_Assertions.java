package junit5Tutorials;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
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

        assertEquals(actual,expected);
        assertTrue(actual.equals(expected));
        assertFalse(!actual.equals(expected));
actual=null;
        assertNull(actual, "actual değer null değildir");
        actual="Kenan";
        assertNotNull(actual,"actual deger null");
    }
    @Test
    @DisplayName("ToContain Testi")
    void testToContain(){
        boolean actual ="erdem".contains("hi");//false verir

        boolean expected=false;

        assertEquals(expected,actual,"degerler esit değil");


    }
}
