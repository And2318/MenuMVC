package controllers;

import models.NumeroM;
import views.MainViews;

public class NumeroCon {
    private NumeroM model;
    private MainViews view;

    public NumeroCon(NumeroM model, MainViews view) {
        this.model = model; //  Ahora usa el modelo pasado como parámetro
        this.view = view;  // Usa la vista unificada correctamente
    }

    public void verificarNumero() {
        int numero = view.pedirNumero();
        boolean resultado = model.esDigitIncreasing(numero); // Asegurar nomenclatura correcta
        view.mostrarResultadoDigitIncreasing(resultado, numero); // Se usa el método correcto en la vista
    }

    public void ejecutar() {
        verificarNumero();  // Llamada directa sin redundancias
    }
}
