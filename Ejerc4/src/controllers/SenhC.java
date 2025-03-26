package controllers;

import models.SenhM;
import views.MainViews;

public class SenhC {
    private SenhM model;
    private MainViews view;  

    public SenhC(MainViews vista) {
        this.model = new SenhM();
        this.view = vista; 
    }

    public void ejecutar() {
        int n = view.pedirN();
        double x = view.pedirX();
        double resultado = model.calcularTerminoSenh(n, x);
        view.mostrarResultadoSenh(resultado);
    }
}
