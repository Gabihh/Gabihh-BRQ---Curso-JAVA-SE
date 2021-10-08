/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classeinternadeinstancia;

/**
 *
 * @author Gabihh
 */
public class ClasseInternaDeInstancia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // instanciando a classe externa
        CE souExterno = new CE();
        System.out.println(souExterno.getTxt1());
        
        // instanciando a classe interna de instância
        CE.CII souInternoInstancia = souExterno.new CII();
        souInternoInstancia.imprime();
    }
    
}
