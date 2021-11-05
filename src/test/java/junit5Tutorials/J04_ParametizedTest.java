package junit5Tutorials;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class J04_ParametizedTest {
    //Asla onerilmez kesinlikle yapma ama bil
    @Test
    void uzunlukSifirdenBuyuk() {
        assertTrue("haluk".length() > 0);
        assertTrue("salih".length() > 0);
        assertTrue("yağmur".length() > 0);
        assertTrue("gülcan".length() > 0);
    }

    /*
       lenght() metodunun aşağıdaki koşullar için 0'dan büyük değer döndürüp döndürmediğini test ediniz.
        Koşullar: ABCD, ABC, A, ABCDE --> bu veriler testi nasıl geçer...

        TEKİL ŞART

   */
    @ParameterizedTest
    @ValueSource(strings = {"haluk", "salih", "yagmur", "gülcan"})
//passed
    void uzunlukSifirdanBuyukParametreli(String str) {//parametre elemanları(strings)method döngü oluşturup run ediyor
        assertTrue(str.length() > 0);
    }

    //ÇOKLU ŞART---Key-Value ikili parameetre ile çalışır
    //CSV dosyası(Comma-Separated Variables)Virgülle ayrılmış değerler
    @ParameterizedTest(name = "(Expected)BUYUKHARF:{0},(actual)cevirilecek:{-1}")//bu mecburi sintax
    //ParametizedTest-->parametresi{} ile Expected: {0},actual:{1} yazılmalı
    @CsvFileSource(resources = "/data.csv")
    void upperCaseFromCsvFile(String kelime, String bykHrf) {
        assertEquals(bykHrf, kelime.toUpperCase());
    }
}

