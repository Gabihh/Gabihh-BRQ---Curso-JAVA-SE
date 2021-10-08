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
public class Aluno extends Pessoa {
    private String matricula;
    
    public Aluno(){super();}
    public Aluno(String nome, 
            String cpf, 
            Date dataNascimento, 
            String matricula){
        super(nome, cpf, dataNascimento);
        this.matricula = matricula;
    }
    
    public String getMatricula(){return this.matricula;}
    
    public void setMatricula(String matricula){this.matricula = matricula;}
    
    @Override
    public double tirarCopia(double qtd){
        return qtd * 0.07;
    }
}
