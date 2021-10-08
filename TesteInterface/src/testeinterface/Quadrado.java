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
public class Quadrado implements FiguraGeometrica {
    private double lado;
    public Quadrado(double lado) {
        this.lado = lado;
    }
    
    // métodos da interface sobrecarregados na classe
    public String getNomeFigura() {return "quadrado";}
    public double getLado() {return lado;}
    public double getPerimetro() {return lado * 4.0;}
    public double getArea() {return lado * lado;} 

}
