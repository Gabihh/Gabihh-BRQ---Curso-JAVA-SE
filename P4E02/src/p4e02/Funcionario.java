/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p4e02;

/**
 *
 * @author Gabihh
 */
public class Funcionario {
    protected String nome;
    protected String rg;
    protected double salarioMensal;
    
    public Funcionario(){}
    public Funcionario(String nome, 
            String rg, 
            double salarioMensal){
        this.nome = nome;
        this.rg = rg;
        this.salarioMensal = salarioMensal;
    }
    
    public String getNome(){return this.nome;}
    public String getRG(){return this.rg;}
    public double getSalarioMensal(){return this.salarioMensal;}

    public void setNome(String nome){this.nome = nome;}
    public void setRG(String rg){this.rg = rg;}
    public void setSalarioMensal(double salarioMensal){this.salarioMensal = salarioMensal;}
    
    public final double pagamento(){
        return salarioMensal - (salarioMensal * 0.15);
    }
}
