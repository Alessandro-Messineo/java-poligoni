package org.lessons.java.poligoni;

public class Rettangolo extends AbstractPoligono{

    private int base;
    private int altezza;

    public Rettangolo(String nome, int base, int altezza){
        super(nome);
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public int calcolaArea(){
        return base * altezza;
    }

    @Override
    public int calcolaPerimetro(){
        return 2 * (base + altezza);
    }
    

}
