/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classeinternalocal;

/**
 *
 * @author Gabihh
 */
public class ClasseInternaLocal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // instanciando a classe externa
        CE souExterno = new CE();
        System.out.println(souExterno.getTxt1());
        
        // evocando o método que cria a classe interna local
        souExterno.imprimeCE();
    }
    
}
