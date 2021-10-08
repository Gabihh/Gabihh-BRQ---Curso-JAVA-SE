/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classeinternaestatica;

/**
 *
 * @author Gabihh
 */
public class ClasseInternaEstatica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // instanciando a classe externa
        CE souExterno = new CE();
        System.out.println(souExterno.getTxt1());
        System.out.println(souExterno.getTxt2());
        
        // instanciando a classe interna estática
        CE.CIE souInternoEstatico = new CE.CIE();
        souInternoEstatico.imprime();
        
        // evocando método estático
        CE.CIE.imprimeEstatico();
    }
    
}
