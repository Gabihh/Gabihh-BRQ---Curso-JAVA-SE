/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2e01;

/**
 *
 * @author Gabihh
 */
public class Funcionario {
    private int codFunc;
    private String nomeFunc;
    private double salarioMensal;
    
    //contrutor vazio
    public Funcionario(){
    }
    
    //contrutor com três parâmetros
    public Funcionario(int codFunc, String nomeFun, double salarioMensal){
        this.codFunc = codFunc;
        this.nomeFunc = nomeFun;
        this.salarioMensal = salarioMensal;
    }
    
    //métodos getters
    public int getCodFunc(){
        return this.codFunc;
    }
    public String getNomeFunc(){
        return this.nomeFunc;
    }
    public double getSalarioMensal(){
        return this.salarioMensal;
    }
    public double getSalarioAnual(){
        return this.salarioMensal * 12;
    }
    
    //métodos setters
    public void setCodFunc(int codFunc){
        this.codFunc = codFunc;
    }
    public void setNomeFunc(String nomeFunc){
        this.nomeFunc = nomeFunc;
    }
    public void setSalarioMensal(double salarioMensal){
        this.salarioMensal = salarioMensal;
    }
    public void setAumento(double aumento){
        this.salarioMensal +=  this.salarioMensal * aumento / 100;
        //this.salarioMensal =  this.salarioMensal * (1 + aumento / 100);
        //this.salarioMensal *= (1+aumento/100); - Forma reduzida
    }
    
}
