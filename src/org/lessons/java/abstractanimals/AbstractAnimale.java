package org.lessons.java.abstractanimals;

// classe astratta
public abstract class AbstractAnimale {

    // metodo astratto (cambia per ogni sottoclasse)
    public abstract void faiVerso();
    public abstract void mangia();
    
    // metodo normale (cioè uguale per tutti)
    public void dormi() {
        System.out.println("Zzzz");
    }

}
