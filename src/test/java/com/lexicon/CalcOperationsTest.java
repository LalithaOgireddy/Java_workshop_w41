package com.lexicon;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalcOperationsTest {

    @Test
    void testaddpositive() {
        Assertions.assertEquals(10,CalcOperations.add(7,3));
    }

    @Test
    void testaddnegative() {
        Assertions.assertNotEquals(11,CalcOperations.add(7,3));
    }

    @Test
    public void testSubtractReturn10(){
        int expected = 10;
        int actual = CalcOperations.subtract(15,5); // 10
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testSubtractInWrongWay(){
        Assertions.assertNotEquals(10, CalcOperations.subtract(10,5));
    }

    @Test
    void testmultiplypositive() {
        Assertions.assertEquals(21,CalcOperations.multiply(7,3));
    }

    @Test
    void testmultiplynegative() {
        Assertions.assertNotEquals(21,CalcOperations.multiply(8,2));
    }

    @Test
    void testdividepositive() {
        Assertions.assertEquals(3,CalcOperations.divide(9,3));
    }

    @Test
    void testdividenegative() {
        Assertions.assertNotEquals(21,CalcOperations.divide(8,3));
    }
}