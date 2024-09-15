package ar.utn.bda.util;

public abstract class MathUtil {

    public static boolean isMultipleOf(int mult, int n){
        return mult % n == 0;
    }

    public static boolean isPrime(int n){
        if (n == 2) return true;
        for (int i = 2; i < n/2; i++) {
            if (isMultipleOf(n, i)) return false;
        }
        return true;
    }

    public static boolean isOdd(int n){
        return n % 2 == 1;
    }

    public static boolean isEven(int n){
        return isMultipleOf(n, 2);
    }

}
