package com.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;

public class TestSkyline {
    @Test
    public void testGetBrushStrokes() {
        Integer[] heights = {2,1,2,3};
        Integer expected = 4;
        test(heights, expected);
    }
    @Test
    public void testGetBrushStrokes2() {
        Integer[] heights = {4,3,2,6,4,2,5};
        Integer expected = 11;
        test(heights, expected);
    }
    @Test
    public void testGetBrushStrokes3() {
        Integer[] heights = {4,3,2,6,0,4,1,5};
        Integer expected = 16;
        test(heights, expected);
    }

    public void test(Integer[] heights, Integer expected) {
        Integer actual = Skyline.getBrushStrokes(heights);
        Assert.assertEquals(expected, actual);
    }
}
