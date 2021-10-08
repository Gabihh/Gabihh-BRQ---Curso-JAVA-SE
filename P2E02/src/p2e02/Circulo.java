/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2e02;

/**
 *
 * @author Gabihh
 */
public class Circulo {
    private double raio;
    
    public Circulo(){
    }
    public Circulo(double raio){
        this.raio = raio;
    }
    
    public double getRaio(){
        return this.raio;
    }
    public double getArea(){
        return Math.pow(this.raio, 2) * Math.PI;
    }
    public double getPerimetro(){
        return 2 * Math.PI * this.raio;
    }
                
    public void setRaio(double raio){
        this.raio = raio;
    }
}
