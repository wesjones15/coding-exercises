package com.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestDepth {
    @Test
    public void testGetDepth() {
        String input = "(1 2 (5 9 2 (4 2 8) 4 7 6)";
        int actual = Depth.solution(input);
        int expected = 111;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetUniqueNames() {
        ArrayList<String> names = new ArrayList<>();
        names.add("kendra");
        names.add("kai");
        names.add("ryan");
        names.add("val");
        names.add("kai");
        names.add("kai");
        names.add("ryan");
        List<String> actual = Depth.makeUniqueNames(names);
        ArrayList<String> expected = new ArrayList<>();
        expected.add("kai");
        expected.add("kai1");
        expected.add("kai2");
        expected.add("kendra");
        expected.add("ryan");
        expected.add("ryan1");
        expected.add("val");
        Assert.assertEquals(expected, actual);
    }
}
