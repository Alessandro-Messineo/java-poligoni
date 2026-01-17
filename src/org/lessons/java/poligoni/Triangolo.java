package org.lessons.java.poligoni;

public class Triangolo extends AbstractPoligono {

    private double lato1, lato2, lato3;

    public Triangolo(String nome, double lato1, double lato2, double lato3) {
        super(nome);
        this.lato1 = lato1;
        this.lato2 = lato2;
        this.lato3 = lato3;
    }

    @Override
    public double calcolaArea() {
        double semiPerimetro = calcolaPerimetro() / 2;
        return Math.sqrt(semiPerimetro * (semiPerimetro - lato1) * (semiPerimetro - lato2) * (semiPerimetro - lato3));

    }

    @Override
    public double calcolaPerimetro() {
        return lato1 + lato2 + lato3;
    }

}
