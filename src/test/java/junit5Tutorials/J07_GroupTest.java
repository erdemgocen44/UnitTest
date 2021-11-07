package junit5Tutorials;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class J07_GroupTest {
    @ParameterizedTest
    @CsvSource(value = {"12,3,4", "5,5,1", "12,-2,-6", "-8,4,-2"})
    void carp(int sonuc, int x, int y) {
        assertEquals(sonuc, (x * y));
    }//@Nested testler, test yazarına çeşitli test grupları arasındaki ilişkiyi ifade etme konusunda daha fazla yetenek verir. Bu tür iç içe testler, Java'nın iç içe sınıflarından yararlanır ve test yapısı hakkında hiyerarşik düşünmeyi kolaylaştırır.
    @Nested//parent test gibi kapsamındaki class'ındaki tüm testleri aynı anda run eder.
    //@Nested--> parent'i oldg  class level'de çalışır
    @DisplayName("group test run")
    class SifirIcerenCarpim {
        @ParameterizedTest
        @CsvSource(value = {"0,0,4", "0,5,0", "0,0,-6", "0,4,0"})
        void carp(int sonuc, int x, int y) {
            assertEquals(sonuc, (x * y));
        }
        @ParameterizedTest
        @CsvSource(value = {"4,0,4", "5,5,0", "-6,0,-6", "4,4,0"})
        void topla(int sonuc, int x, int y) {
            assertEquals(sonuc, (x + y));
        }
    }
}
