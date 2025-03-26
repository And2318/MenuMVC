package models;

public class GranjasAnimales {
    private int patos;                              
    private int conejos;

    public void calcularAnimales(int cabezas, int patas) {
        this.conejos = (patas - (2 * cabezas)) / 2;
        this.patos = cabezas - this.conejos;
    }

    public int getPatos() {
        return patos;
    }

    public int getConejos() {
        return conejos;
    }
}
