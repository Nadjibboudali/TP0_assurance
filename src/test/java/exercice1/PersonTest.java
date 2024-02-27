package exercice1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {


    @Test
    @DisplayName("afficher le nom complet : nom prenom")
    void getFullName() {
        Person p  = new Person("boudali","nadjib",17);
        assertEquals("boudali nadjib",p.getFullName());
    }

    @Test
    @DisplayName("true si age >=18")
    void isAdult() {
        Person p1  = new Person("arkab","mouhamed",28);
        Person p2  = new Person("brouki","sami",18);
        assertAll(
                () -> assertEquals(true,p1.isAdult()),
                () -> assertEquals(true,p2.isAdult())
        );
    }

    @Test
    void isadultinferierea18(){
        Person p  = new Person("boudali","nadjib",17);
        assertEquals(false,p.isAdult());

    }
}