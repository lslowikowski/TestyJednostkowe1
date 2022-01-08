package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ProstokatTest {

    @Test
    void ujemnaWartoscBokuAJestNiedozwolona() {
        Prostokat prostokat = new Prostokat(Float.MAX_VALUE, 3);
        prostokat.setBokA(Float.MAX_VALUE);
        //Assertions.assertTrue(prostokat.getBokA()==5);
        Assertions.assertEquals(Float.MAX_VALUE, prostokat.getBokA());
    }

    @Test
    void ujemnaWartoscBokuBJestNiedozwolona() {
        for (int i = 0; i < 10 ; i++) {
            Prostokat prostokat = new Prostokat(5, i);
            prostokat.setBokB(-i);
            Assertions.assertEquals(i, prostokat.getBokB());
        }

    }

    @Test
    void ujemneWartosciWKonstruktorzeSaNiedozwolone() {
        Prostokat prostokat = new Prostokat(-8, -3);
        Assertions.assertEquals(8, prostokat.getBokA());
        Assertions.assertEquals(3, prostokat.getBokB());
    }

    @Test
    void poprawneObliczenieObwodu() {
        Prostokat prostokat = new Prostokat(-3, 5);
        Assertions.assertEquals(16, prostokat.obliczObwod());
    }

    @Test
    void poprawneObliczeniePowierzchni() {
        Prostokat prostokat = new Prostokat(4, -5);
        Assertions.assertEquals(20, prostokat.obliczPole());
    }
    
}