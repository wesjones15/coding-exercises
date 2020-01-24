package com.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;

public class TestEvenFibonnacci {

    @Test
    public void testGetSum() {
        Integer[] arr = {1,3,4,5,68,3,22};
        int actual = EvenFibonnacci.getSumOfLastTwo(arr);
        int expected = 25;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetFibonacci() {
        Integer[] actual = EvenFibonnacci.getFibonnacciNumbers(5);
        Integer[] expected = {1,2,3,5,8};
        for (int i = 0; i < expected.length; i++) {
            Assert.assertEquals(expected[i], actual[i]);
        }
    }

    @Test
    public void testGetFibonacci2() {
        Integer[] actual = EvenFibonnacci.getFibonnacciNumbers(5);
        Assert.assertEquals(5, actual.length);
    }

    @Test
    public void testEven() {
        Integer[] in = EvenFibonnacci.getFibonnacciNumbers(8);
        Integer actual = EvenFibonnacci.getSumOfEvenNumbers(in);
        Integer expected = 44;
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testEven2() {
        Integer[] in = EvenFibonnacci.getFibonnacciNumbers(2);
        Integer actual = EvenFibonnacci.getSumOfEvenNumbers(in);
        Integer expected = 2;
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testEven3() {
        Integer[] in = EvenFibonnacci.getFibonnacciNumbers(4);
        Integer actual = EvenFibonnacci.getSumOfEvenNumbers(in);
        Integer expected = 2;
        Assert.assertEquals(expected,actual);
    }
}
