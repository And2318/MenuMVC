package main1;

import java.util.Scanner;
import controllers.*;
import models.*;
import views.MainViews;

public class Mine1 {
    public static void main(String[] args) {
        MainViews vista = new MainViews();
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            vista.mostrarMenu();
            int opcion = vista.leerOpcion();

            switch (opcion) {
                case 1: // Gestión de Granja
                    new GranjaControlador(vista).ejecutar();
                    break;
                case 2: // Digitincreasing
                    new NumeroCon(new NumeroM(), vista).ejecutar();
                    break;
                case 3: // Número Palíndromo
                    new PalindromoCon(vista).iniciar();
                    break;
                case 4: // Calcular Senh(x)
                    new SenhC(vista).ejecutar();
                    break;
                case 5: // Salir
                    salir = true;
                    vista.despedida();
                    break;
                default:
                    System.out.println(" Opción inválida. Intente de nuevo.");
            }
        }

        scanner.close();
    }
}
