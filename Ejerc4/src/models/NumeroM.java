package models;

public class NumeroM {

    public boolean esDigitIncreasing(int numero) {
        for (int n = 1; n <= 9; n++) { // Probar con dígitos del 1 al 9
            int suma = 0;
            int termino = 0;

            while (suma < numero) {
                termino = termino * 10 + n; // Construir términos (1, 11, 111...)
                suma += termino;

                if (suma == numero) {
                    return true;
                }
            }
        }
        return false;
    }
}
