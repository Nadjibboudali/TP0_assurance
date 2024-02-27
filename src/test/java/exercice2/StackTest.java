package exercice2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    static Stack s ;
    @BeforeEach
    void  setUp(){
         s = new Stack();
    }

    @Test
    @DisplayName("methode recoit un entier et doit ajouter dans la pile ")
    void intpushtest(){
       s.push(5);
       s.push(4);
    }
    @Test
    @DisplayName("methode recoit un entier et doit ajouter dans la pile ")
    void charpushtest(){
        s.push('8');
        s.push('l');
        s.push('s');
    }

    @Test
    @DisplayName("methode renvoie un element qui au soment de la pile et retirer de la pile  ")

    void pop() {
        s.push(5);
        s.push(4);
        assertEquals(4,s.pop());
    }
    @Test
    @DisplayName("this method throw an exeption if  we call pop methode while sthe stack is empty")
    void testpeekemptyexeption (){
        assertThrows(IllegalStateException.class,() -> s.pop());
    }


    @Test
    @DisplayName(" renvoie l'element dans le sommet de la pile sans le retirer ")
    void testpeek() {
        s.push(5);
        assertEquals(5,s.peek());
        //tester if the methode of peek did remove the element form the stack
        assertEquals(5,s.pop());
    }
    @Test
    @DisplayName("the methode fourint illegalstateexception if the stack is empty ")
    void testpeekexeption(){
        assertThrows(IllegalStateException.class,() -> s.peek());
    }



    @Test
    @DisplayName("return true si la pile est vide ")
    void isEmpty() {
        assertEquals(true,s.isEmpty());
    }

    @Test
    @DisplayName("return false si la pile est  pas vide ")
    void testisEmpty() {
        s.push(6);
        assertEquals(false,s.isEmpty());
    }

    @Test
    @DisplayName("return nombres d'elements dans la pile si inferieure ou egale a 10")
    void testsize() {
        for (int i =0;i<9;i++)
        s.push(i);
        assertEquals(9,s.size());
    }

    @Test
    @DisplayName("la methode doit ajouter une taille sur la capacite initiale 10 si on ajoute plus de 10 elements")
    void testajoutsize() {
        for (int i =0;i<11;i++)
            s.push(i);
        assertEquals(11,s.size());
    }
}