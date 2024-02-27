package exercice4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeTest {


    @Test
    @DisplayName("return false number inferieure a 2 ")
    void testPrimelessthantwo(){
        assertFalse(Prime.isPrime(-6));
    }

    @Test
    @DisplayName("retourner false numero pas Prime")
    void testPrime() {

        assertFalse(Prime.isPrime(6));

    }
    @Test
    @DisplayName("retourner true le numero est premier  ")
    void testprimetrue() {

        assertTrue(Prime.isPrime(31));
    }
}