/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2e03;

/**
 *
 * @author Gabihh
 */
public class ContaCorrente {
    private int numCC;
    private double saldoCC;
    
    public ContaCorrente(){
    }
    public ContaCorrente(int numCC, double saldoCC){
        this.numCC = numCC;
        this.saldoCC = saldoCC;
    }
    
    public int getNumCC(){
        return this.numCC;
    }
    public double getSaldoCC(){
        return this.saldoCC;
    }
    
    public void setNumCC(int numCC){
        this.numCC = numCC;
    }
    public void setSaldoCC(double saldoCC){
        this.saldoCC = saldoCC;
    }
    public void setDepositar(double depositar){
        this.saldoCC += depositar;
    }
    public void setSacar(double sacar){
        this.saldoCC -= sacar;
    }
}
