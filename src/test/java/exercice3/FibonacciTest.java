package exercice3;

import exercice2.Stack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {


    Fibonacci f;

    @BeforeEach
    void  setUp(){
        f = new Fibonacci();
    }


    @Test
    @DisplayName("mehode test if ficbonaci retun < 0")
    void test_fibonaci_nagative(){
        assertThrows(IllegalArgumentException.class,() -> f.fibonacci(-2));
    }

    @Test
    @DisplayName("mehode test if ficbonaci retun  0")
    void test_fibonaci_eqaul_zero(){
        assertEquals(0, f.fibonacci(0));
    }

    @Test
    @DisplayName("mehode test if ficbonaci retun 1")
    void test_fibonaci_eqaul_one(){
        assertEquals(1, f.fibonacci(1));
    }

    @Test
    @DisplayName("mehode test if ficbonaci retun number > 1")
    void test_fibonaci_bigger_than_one(){

        assertAll(() ->assertEquals(2, f.fibonacci(3)),
                () ->assertEquals(3, f.fibonacci(4)),
                () -> assertEquals(34, f.fibonacci(9))
        );


    }







}