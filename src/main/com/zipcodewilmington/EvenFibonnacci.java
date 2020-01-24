package com.zipcodewilmington;

import java.util.Arrays;

public class EvenFibonnacci {

    public static Integer getSumOfEvenNumbers(Integer[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }
        return sum;
    }

    public static Integer[] getFibonnacciNumbers(int amount) {
        Integer[] fib = new Integer[0];
        fib = add(fib, 1);
        fib = add(fib, 2);
        for (int i = 2; i < amount; i++) {
            fib = add(fib, getSumOfLastTwo(fib));
        }
        return fib;
    }

    public static Integer getSumOfLastTwo(Integer[] arr) {
        int sum = 0;
        for (int i = arr.length-2; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static Integer[] add(Integer[] arr, Integer value) {
        Integer[] out = new Integer[arr.length + 1];
//        System.arraycopy(arr, 0, out, 0, out.length);
        for (int i = 0; i < arr.length; i++) out[i] = arr[i];
        out[out.length-1] = value;
        return out;
    }
}
