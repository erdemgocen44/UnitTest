package junit5Tutorials;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class J03_TestingExceptions {
    /*
        assertThrow() metodu --> belirtilen işlemin (executable) belirtilen türde bir Exception oluşturup oluşturmadığını
        test eder.
            Dolayısıyla 2 parametre alır.
            1. parametre --> expected(beklenen) Exception(istisna) türü,
            2. parametre --> actual(oluşacak)  çalıştırılacak olan işlemdir.
        Eğer işlem belirtilen türde bir exception oluşturursa test başarılı olur.TEST PASSED
        Ama exception oluşmaz ise veya türü yanlış olursa test başarısız olur.TEST FAILED
        Exception.io türünde parent-child ilişkisi var ise yine test başarılı sayılır.
     */
    @Test
    void testException1() {
        String strSayi = "14a3";
        assertThrows(NumberFormatException.class, () -> Integer.parseInt(strSayi));//passed
        //Integer intSayi= Integer.parseInt(strSayi);
    }

    @Test
    @DisplayName("Null pointer test")
    void testException2() {
        String str = null;
        //String str = "Hakan";
        //  str.length();
        assertThrows(NullPointerException.class, () -> str.length());//passed
        assertThrows(NumberFormatException.class, () -> str.length());//failled->farklı tür exception fırlatır
    }

    @Test
    void testException3() {
        assertThrows(IllegalArgumentException.class, () -> yasYazdir(-2));//passed

    }

    void yasYazdir(int yas) {
        if (yas < 0) {
            throw new IllegalArgumentException();
        } else System.out.println(yas);
    }

    @Test
    @DisplayName("ArithmeticException TEST")
    void testException4() {
        //assertThrows(ArithmeticException.class, () ->bol(3,2));//failed
        assertThrows(ArithmeticException.class, () ->bol(3,0));//failed

    }

    int bol(int a, int b) {
        return a / b;
    }
}
