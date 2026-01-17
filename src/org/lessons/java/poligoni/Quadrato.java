package org.lessons.java.poligoni;

public class Quadrato extends AbstractPoligono {

    private double lato;

    public Quadrato(String nome, double lato) {
        super(nome);
        this.lato = lato;
    }

    @Override
    public double calcolaArea() {
        return lato * lato;
    }

    @Override
    public double calcolaPerimetro() {
        return lato * 4;
    }

}
