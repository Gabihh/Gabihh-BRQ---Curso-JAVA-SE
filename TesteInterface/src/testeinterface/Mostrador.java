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
public class Mostrador {
    public void mostraNomeFigura(FiguraGeometrica f) {
        System.out.println("figura = " + f.getNomeFigura());
    }
    
    public void mostraLado(FiguraGeometrica f) {
        System.out.println("lado = " + f.getLado());
    }
    
    public void mostraPerimetro(FiguraGeometrica f) {
        System.out.println("perímetro = " + f.getPerimetro());
    }
    
    public void mostraArea(FiguraGeometrica f) {
        System.out.println("área = " + f.getArea());
    } 
}
