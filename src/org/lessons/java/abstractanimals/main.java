package org.lessons.java.abstractanimals;

public class main {
    public static void main(String[] args) {

        System.out.println("-----------------------------------");

        // creo un delfino
        AbstractAnimale delfinoPoppy = new Delfino("Poppy");
        
        System.out.println("----- Il delfino: -----" );
        delfinoPoppy.faiVerso();
        delfinoPoppy.mangia();  
        delfinoPoppy.dormi();

        // creo un cane
        AbstractAnimale caneRex = new Cane("Rex", "Labrador");
        
        System.out.println("----- Il cane: -----" );
        caneRex.faiVerso();
        caneRex.mangia();  
        caneRex.dormi();

        // creo un passerotto
        AbstractAnimale passerottoPino = new Passerotto("Pino");
        
        System.out.println("----- Il passerotto: -----" );
        passerottoPino.faiVerso();
        passerottoPino.mangia();  
        passerottoPino.dormi();

        // creo un aquila
        AbstractAnimale aquilaLuna = new Aquila("Luna");
        
        System.out.println("----- L'aquila: -----" );
        aquilaLuna.faiVerso();
        aquilaLuna.mangia();  
        aquilaLuna.dormi();



        System.out.println("-----------------------------------");
    }
    
}
