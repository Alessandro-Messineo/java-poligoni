package org.lessons.java.poligoni;

public class Quadrato extends AbstractPoligono{

    private int lato;

    public Quadrato(String nome, int lato){
        super(nome);
        this.lato = lato;
    }

    @Override
    public int calcolaArea(){
        return lato * lato;
    }

    @Override
    public int calcolaPerimetro(){
        return lato * 4;
    }

}
