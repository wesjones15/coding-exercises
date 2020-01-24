package com.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;

public class TestPrimeFactors {
    @Test
    public void testGetFactors() {
        Integer[] actual = PrimeFactors.getFactors(5);
        Assert.assertEquals(0, actual.length);
    }

    @Test
    public void testGetFactors2() {
        Integer[] actual = PrimeFactors.getFactors(1);
        Assert.assertEquals(0, actual.length);
    }

    @Test
    public void testGetPrimeFactors1() {
        Integer[] actual = PrimeFactors.getPrimeFactors(13195);
        Integer[] expected = {5,7,13,29};
        for (int i = 0; i < actual.length; i++) {
            Assert.assertEquals(expected[i], actual[i]);
        }
    }
    
//    @Test
//    public void testGetPrimeFactors2() {
//        Integer[] actual = PrimeFactors.getPrimeFactors(600851475);
//        Integer[] expected = {5,7,13,29};
//        for (int i = 0; i < actual.length; i++) {
//            Assert.assertEquals(expected[i], actual[i]);
//        }
//    }
}
