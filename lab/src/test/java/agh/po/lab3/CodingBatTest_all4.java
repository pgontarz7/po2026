package agh.po.lab3;

import org.junit.Test;

import static org.junit.Assert.*;

public class CodingBatTest_all4 {

    CodingBat codingBat = new CodingBat();

    @Test

    public void doubleX() {
        assertTrue(codingBat.doubleX("axxbb"));
        assertFalse(codingBat.doubleX("axaxax"));
        assertTrue(codingBat.doubleX("xxxxx"));
        assertFalse(codingBat.doubleX("aaaa"));
    }

    @Test
    public void countXX() {
        assertEquals(1, codingBat.countXX("abcxx"));
        assertEquals(2, codingBat.countXX("xxx"));
        assertEquals(3, codingBat.countXX("xxxx"));
        assertEquals(0, codingBat.countXX("asdf"));
    }

    @Test
    public void helloName() {
        assertEquals("Hello Bob!", codingBat.helloName("Bob"));
        assertEquals("Hello Alice!", codingBat.helloName("Alice"));
        assertEquals("Hello X!", codingBat.helloName("X"));
    }

    @Test
    public void countEvens() {
        assertEquals(3, codingBat.countEvens(new int[]{2, 1, 2, 3, 4}));
        assertEquals(3, codingBat.countEvens(new int[]{2, 2, 0}));
        assertEquals(0, codingBat.countEvens(new int[]{1, 3, 5}));
    }
}