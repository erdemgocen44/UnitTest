package junit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class C03_ArrayEsitMiTest {

    @ParameterizedTest
    @MethodSource("ArraySaglayici")
//parametrenin alınacağı method name girilir. Haricten başka method(ArraySaglayici) bu teste parametre gönderecek
    void diziKiyasla(Boolean sonuc, Object[] a, Object[] b) {
        assertEquals(sonuc, C03_ArrayEsitMi.diziKiyasla(a, b));

    }

    //return type  igirlmesi gerekir
    static Stream<Arguments> ArraySaglayici() {//Trick: return tek parametre döndürürken Stream<Arguments> komut ile 3 parametre döndürecek
        //ArraySaglayici methodu stream classına Argument parametre return ediyor
        Integer[] a1 = {1, 2, 3};
        Integer[] a2 = {2, 3, 1};

        String[] s1 = {"h", "a", "y"};
        String[] s2 = {"a", "y", "h"};

        Double[] d1 = {1.2, 3.4, 8.9};
        Double[] d2 = {3.4, 8.9, 1.2};

        float[] f1 = {1f, 3f, 5.6f};
        float[] f2 = {3f, 5.6f, 2f};

        return Stream.of(
                Arguments.of(true, a1, a2),
                Arguments.of(true, s1, s2),
                Arguments.of(true, d1, d2),
                Arguments.of(false, f1, f2)

        );


    }

}