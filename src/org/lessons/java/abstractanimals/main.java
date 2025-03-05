package org.lessons.java.abstractanimals;

public class main {
    public static void main(String[] args) {

        System.out.println("-----------------------------------");

        // creo un delfino
        Delfino delfinoPoppy = new Delfino("Poppy");
        
        System.out.println("----- Il delfino: -----" );
        delfinoPoppy.faiVerso();
        delfinoPoppy.mangia();  
        delfinoPoppy.dormi();

        // creo un cane
        Cane caneRex = new Cane("Rex", "Labrador");
        
        System.out.println("----- Il cane: -----" );
        caneRex.faiVerso();
        caneRex.mangia();
        caneRex.dormi();

        // creo un passerotto
        Passerotto passerottoPino = new Passerotto("Pino");
        
        System.out.println("----- Il passerotto: -----" );
        passerottoPino.faiVerso();
        passerottoPino.mangia();  
        passerottoPino.dormi();

        // creo un aquila
        Aquila aquilaLuna = new Aquila("Luna");
        
        System.out.println("----- L'aquila: -----" );
        aquilaLuna.faiVerso();
        aquilaLuna.mangia();
        aquilaLuna.dormi();

        // testando interfacce
        System.out.println("----- Interfacce: -----" );
        faiVolare(aquilaLuna);
        faiNuotare(delfinoPoppy);
        faiVolare(passerottoPino);

        System.out.println("-----------------------------------");
    }

    // metodi delle intefacce 
    static void faiNuotare(INuotante AnimaleNuotante) {
        AnimaleNuotante.nuota();
    }
    static void faiVolare(IVolante animaleVolante) {
        animaleVolante.vola();
    }

    
}
