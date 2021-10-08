/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeinterface;

/**
 *
 * @author Gabihh
 */
public class TesteInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //usando a interface como tipo de referência aos objetos
        FiguraGeometrica Q = new Quadrado(10.0);
        FiguraGeometrica T = new Triangulo(10.0);
        
        //criando um Mostrador
        Mostrador jose = new Mostrador();
        
        System.out.println("*-----------------*");
        
        jose.mostraNomeFigura(Q);
        jose.mostraLado(Q);
        jose.mostraPerimetro(Q);
        jose.mostraArea(Q);
        
        System.out.println("*-----------------*");
        
        jose.mostraNomeFigura(T);
        jose.mostraLado(T);
        jose.mostraPerimetro(T);
        jose.mostraArea(T);
        
        System.out.println("*-----------------*");
    }
    
}
