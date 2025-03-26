package models;

public class SenhM {
    public long factorial(int num) {
        long result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    public double calcularTerminoSenh(int n, double x) {
        return Math.pow(x, 2 * n + 1) / factorial(2 * n + 1);
    }
}
