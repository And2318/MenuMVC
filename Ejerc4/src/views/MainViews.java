package views;

import java.util.Scanner;

public class MainViews {
    private Scanner scanner = new Scanner(System.in);

    // 📌 Mostrar el menú principal
    public void mostrarMenu() {
        System.out.println("\n===== MENÚ PRINCIPAL =====");
        System.out.println("1. Gestión de Granja");
        System.out.println("2. Digitincreasing");
        System.out.println("3. Verificar Palíndromo");
        System.out.println("4. Calcular Senh(x)");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
    }

    public int leerOpcion() {
        return scanner.nextInt();
    }
    // Gestión de Granja
    public int pedirCabezas() {
        System.out.print("Ingrese la cantidad de cabezas de animales en la granja: ");
        return scanner.nextInt();
    }

    public int pedirPatas() {
        System.out.print("Ingrese la cantidad total de patas en la granja: ");
        return scanner.nextInt();
    }

    public void mostrarResultadoGranjaConAnimales(int palabra, int conejos) {
        System.out.println("✅ La granja tiene " + palabra + " patos y " + conejos + " conejos.");
    }
    //  Digitincreasing
    public int pedirNumero() {
        System.out.print("Ingrese un número: ");
        return scanner.nextInt();
    }

    public void mostrarCantidadDigitos(int numero, int cantidad) {
        System.out.println("El número " + numero + " tiene " + cantidad + " dígitos.");
    }
    //  Número Palíndromo
    public String pedirPalabra() {
        System.out.print("Ingrese una palabra o número: ");
        return scanner.next();
    }

    public void mostrarResultadoPalindromo(String palabra, boolean esPalindromo) {
        if (esPalindromo) {
            System.out.println("\"" + palabra + "\" es un palíndromo.");
        } else {
            String i = null;
                        System.out.println("\"" + i + "\" NO es un palíndromo.");
        }
    }
    // Cálculo de Senh(x)
    public int pedirN() {
        System.out.print("Ingrese el valor de n: ");
        return scanner.nextInt();
    }

    public double pedirX() {
        System.out.print("Ingrese el valor de x: ");
        return scanner.nextDouble();
    }

    public void mostrarResultadoSenh(double resultado) {
        System.out.println("El resultado de senh(x) es: " + resultado);
    }

    //  Métodos auxiliares

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void despedida() {
        System.out.println("¡Gracias por usar el programa!");
    }

    public void mostrarResultadoGranja(int patos, int conejos) {
        System.out.println("✅ La granja tiene " + patos + " patos y " + conejos + " conejos.");
    }
    public void mostrarResultadoDigitIncreasing(boolean esDigitIncreasing, int numero) {
        if (esDigitIncreasing) {
        System.out.println("El número " + numero + " es digit-increasing.");
        } else {
        System.out.println("El número " + numero + " NO es digit-increasing.");
        }
    
    }
}    