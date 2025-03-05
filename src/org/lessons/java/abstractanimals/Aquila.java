package org.lessons.java.abstractanimals;

public class Aquila extends AbstractAnimale implements Volante {

    protected String nome;

    public Aquila(String nome) {
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
        System.out.println("Mangio piccoli animali");
    }
    @Override
    public void faiVerso() {
        System.out.println("Stride");
    }

    @Override
    public void vola() {
        System.out.println("Sto volando!");
    }



}
