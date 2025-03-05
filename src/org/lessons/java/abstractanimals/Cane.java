package org.lessons.java.abstractanimals;

public class Cane extends AbstractAnimale {

    protected String nome;
    protected String razza;


    public Cane(String nome, String razza) {
        this.nome = nome;
        this.razza = razza;
    }

    // getters
    public String getNome() {
        return this.nome;
    }
    public String getRazza() {
        return this.razza;
    }

    // setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setRazza(String razza) {
        this.razza = razza;
    }

    // metodi dalla classe astratta
    @Override
    public void mangia() {
        System.out.println("Mangio le crocchette");
    }
    @Override
    public void faiVerso() {
        System.out.println("Abbaia");
    }

}
