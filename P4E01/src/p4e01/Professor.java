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
public class Professor extends Pessoa {
    private double salario;
    private String disciplina;
    
    public Professor(){super();}
    public Professor(String nome, 
            String cpf, 
            Date dataNascimento, 
            double salario, 
            String disciplina){
        super(nome, cpf, dataNascimento);
        this.disciplina = disciplina;
    }
    
    public double getSalario(){return this.salario;}
    public String getDisciplina(){return this.disciplina;}
    
    public void setSalario(double salario){this.salario = salario;}
    public void setDisciplina(String disciplina){this.disciplina = disciplina;}
}
