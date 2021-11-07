package junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class C02_StringChangeTest {
    HesapMakinesi.C02_StringChange strChange = new HesapMakinesi.C02_StringChange();//static olmayan classdan method call etmek için obj create edildi

    @BeforeEach
    void setUp() {
        strChange = new HesapMakinesi.C02_StringChange();
        System.out.println("test verisi create edildi");
    }

    @AfterEach
    void tearDown() {
        strChange = null;
        System.out.println("test verisi silindi");
        System.out.println("     *****     ");


    }

    @ParameterizedTest
    @CsvSource(value = {"BC,AABC", "B,AB", "BCDE,BCDE", "'',AA"})
//hiçlik için '' kullanılır
    void ilkIkiASil(String kirpilmis, String girdi) {
        assertEquals(kirpilmis, strChange.ilkIkiASil(girdi));
        System.out.println("ilk ikide olan A'lar silindi");

    }
}