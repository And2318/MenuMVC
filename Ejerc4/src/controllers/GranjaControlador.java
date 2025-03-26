package controllers;

import models.GranjasAnimales;
import views.MainViews;

public class GranjaControlador {
    private GranjasAnimales model; // Se crea el modelo
    private MainViews view; // Se crea la vista

    public GranjaControlador(MainViews view) {
        this.model = new GranjasAnimales();
        this.view = view;  
    }

    public void resolverProblema() {
        int cabezas = view.pedirCabezas();
        int patas = view.pedirPatas(); 
        
        model.calcularAnimales(cabezas, patas); // Se calculan los animales
        
        view.mostrarResultadoGranja(model.getPatos(), model.getConejos()); // Se muestra el resultado
    }

    public void ejecutar() {
        resolverProblema();  // Se ejecuta el método resolverProblema
    }
}


   