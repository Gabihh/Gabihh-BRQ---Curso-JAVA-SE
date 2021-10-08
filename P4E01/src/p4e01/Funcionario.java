/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p4e01;

import java.util.Date;

/**
 *
 * @author Gabihh
 */
public class Funcionario extends Pessoa {
    private double salario;
    private Date dataAdmissao;
    private String cargo;
    
    public Funcionario(){super();}
    public Funcionario(String nome, 
            String cpf, 
            Date dataNascimento, 
            double salario, 
            Date dataAdmissao, 
            String cargo){
        super(nome, cpf, dataNascimento);
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
        this.cargo = cargo;
    }
    
    public double getSalario(){return this.salario;}
    public Date getDataAdmissao(){return this.dataAdmissao;}
    public String getCargo(){return this.cargo;}
    
    public void setSalario(double salario){this.salario = salario;}
    public void setDataAdmissao(Date dataAdmissao){this.dataAdmissao = dataAdmissao;}
    public void setCargo(String cargo){this.cargo = cargo;}
}
