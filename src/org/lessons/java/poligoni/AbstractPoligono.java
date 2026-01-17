package org.lessons.java.poligoni;

public abstract class AbstractPoligono {

    private String nome;

    public AbstractPoligono(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract double calcolaArea();

    public abstract double calcolaPerimetro();

}
