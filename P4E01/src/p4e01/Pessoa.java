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
public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Date dataNascimento;
    
    public Pessoa(){}
    public Pessoa(String nome, String cpf, Date dataNascimento){
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }
    
    public String getNome(){return this.nome;}
    public String getCPF(){return this.cpf;}
    public Date getDataNascimento(){return this.dataNascimento;}
    
    public void setNome(String nome){this.nome = nome;}
    public void setCPF(String cpf){this.cpf = cpf;}
    public void setDataNascimento(Date dataNascimento){this.dataNascimento = dataNascimento;}
    
    public double tirarCopia(double qtd){
        return qtd * 0.10;
    }
}
