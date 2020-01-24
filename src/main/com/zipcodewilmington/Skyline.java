package com.zipcodewilmington;

public class Skyline {
//    private Integer[] heights;

    public static int getBrushStrokes(Integer[] heights) {
        int strokes = 0;
        int max = getPeak(heights);
        for (int i = 0; i < max; i++) {
            for (int j = 1; j < heights.length; j++) {
                if (heights[j-1] >= i && heights[j] < i || j == heights.length-1) {
                    strokes++;
                }
            }
        }
        return strokes;
    }

    public static int getPeak(Integer[] arr) {
        int max = 0;
        for (Integer num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
