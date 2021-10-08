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
public class Triangulo {
    private double base;
    private double altura;
    
    public Triangulo(){
    }
    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    
    public double getBase(){
        return this.base;
    }
    public double getAltura(){
        return this.altura;
    }
    public double getArea(){
        return this.base * this.altura / 2;
    }
    public double getPerimetro(){
        return this.base + this.altura + Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
    }
    
    public void setBase(double base){
        this.base = base;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
}
