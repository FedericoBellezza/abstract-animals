package org.lessons.java.abstractanimals;

public class Delfino extends AbstractAnimale {

    protected String nome;

    public Delfino(String nome) {
        this.nome = nome;
    }

    // getters
    public String getNome() {
        return this.nome;
    }

    // setters
    public void setNome(String nome) {
        this.nome = nome;
    }


    // metodi dalla classe astratta
    @Override
    public void mangia() {
        System.out.println("Mangio i pesci");
    }
    @Override
    public void faiVerso() {
        System.out.println("Frigge");
    }

}
