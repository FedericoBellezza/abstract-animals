package org.lessons.java.abstractanimals;

public class Passerotto extends AbstractAnimale {

    protected String nome;

    public Passerotto(String nome) {
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
        System.out.println("Mangio i vermi e gli insetti");
    }
    @Override
    public void faiVerso() {
        System.out.println("Cinguetta");
    }

}
