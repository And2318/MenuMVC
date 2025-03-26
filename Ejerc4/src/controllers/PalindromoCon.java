package controllers;

import models.PalindromoMo;
import views.MainViews;

public class PalindromoCon {
    private PalindromoMo modelo; 
    private MainViews vista;  

    public PalindromoCon(MainViews vista) {
        this.modelo = new PalindromoMo(); 
        this.vista = vista;  
    }

    public void iniciar() {
        vista.mostrarMensaje("Bienvenido al verificador de palíndromos");
        String numero = vista.pedirPalabra(); 
        boolean esPalindromo = modelo.esPalindromo(numero);
        vista.mostrarResultadoPalindromo(numero, esPalindromo);  
    }

    public void ejecutar() {
        throw new UnsupportedOperationException("Unimplemented method 'ejecutar'");
    }
}
