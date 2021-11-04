package junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HesapMakinesiTest {

    @Test
    @DisplayName("sayilari toplar")//kullanici veya yonetici bilgilendirmesi icin teste etiket olusturur
    void topla() {
        assertEquals(3,HesapMakinesi.topla(1,2));
        assertEquals(4,HesapMakinesi.topla(-8,12));
        assertEquals(-1,HesapMakinesi.topla(1,-2));
       // assertEquals(3,HesapMakinesi.topla(1,12)); Expected :3.0
        //Actual   :13.0
    }

    @Test
    @DisplayName("sayilari carpar")
    void carp() {
        assertEquals(2.6,HesapMakinesi.carp(1.3,2));
        assertEquals(-24,HesapMakinesi.carp(-8,3));
        assertEquals(-2,HesapMakinesi.carp(1,-2));
    }
}