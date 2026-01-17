package org.lessons.java.poligoni;

public class Rettangolo extends AbstractPoligono {

    private double base;
    private double altezza;

    public Rettangolo(String nome, double base, double altezza) {
        super(nome);
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public double calcolaArea() {
        return base * altezza;
    }

    @Override
    public double calcolaPerimetro() {
        return 2 * (base + altezza);
    }

}
