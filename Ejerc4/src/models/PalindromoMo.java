package models;

public class PalindromoMo {

    public boolean esPalindromo(String numero) {
        numero = numero.toLowerCase().replaceAll("\\s+", ""); 
        String invertida = new StringBuilder(numero).reverse().toString(); // Invierte la cadena
        return numero.equals(invertida);
    }
}
