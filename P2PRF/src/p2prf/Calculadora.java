/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2prf;

/**
 *
 * @author Gabihh
 */
public class Calculadora {
    private double memoria = 0;
    
    public Calculadora(){
    }
    
    public double getSoma(double valor){
        return this.memoria = this.memoria + valor;
    }
    public double getSubtracao(double valor){
        return this.memoria = this.memoria - valor;
    }
    public double getMultiplicacao(double valor){
        return this.memoria = this.memoria * valor;
    }
    public double getDivisao(double valor){
        return  this.memoria = this.memoria / valor;
    }
    public double getExibeMemoria(){
        return this.memoria;
    }
}
