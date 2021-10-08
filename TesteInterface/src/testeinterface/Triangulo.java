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
public class Triangulo implements FiguraGeometrica {
    // triângulo equilátero
    private double lado;
        public Triangulo(double lado) {
        this.lado = lado;
    }
        
    // métodos da interface sobrecarregados na classe
    public String getNomeFigura() {return "triângulo";}
    public double getLado() {return lado;}
    public double getPerimetro() {return lado * 3;}
    public double getArea() {return lado * lado * 0.433;} 

}
