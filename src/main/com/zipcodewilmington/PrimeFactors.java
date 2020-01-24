package com.zipcodewilmington;

public class PrimeFactors {

    public static Integer[] getFactors(Integer in) {
        Integer[] factors = new Integer[0];
        for (int i = in-1; i > 1; i--)
            if (in % i == 0)
                factors = EvenFibonnacci.add(factors, i);

        return factors;
    }

    public static Integer[] getPrimeFactors(Integer in) {
        Integer[] factors = getFactors(in);
        Integer[] primes = new Integer[0];

        for (int i = 0; i < factors.length; i++)
            if (getFactors(factors[i]).length == 0)
                EvenFibonnacci.add(primes, factors[i]);
        return primes;
    }

    public static Boolean testit() {
        C b = new C();
        return b instanceof A;
    }
}

class A {}
class B extends A {}
class C extends B {}
