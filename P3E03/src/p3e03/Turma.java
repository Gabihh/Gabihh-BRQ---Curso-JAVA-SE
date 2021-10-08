/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3e03;

/**
 *
 * @author Gabihh
 */
public class Turma {
    private int idTurma;
    private int qtdAlunos;
    private double notas[];
    
    public Turma(){}
    public Turma(int idTurma, int qtdAlunos, double notas[]){
        this.idTurma = idTurma;
        this.qtdAlunos = qtdAlunos;
        this.notas = notas;
    }
    
    public int getIdTurma(){return this.idTurma;}
    public int getQtdAlunos(){return this.qtdAlunos;}
    public double[] getNotas(){return this.notas;}
    
    public void setIdTurma(int idTurma){this.idTurma = idTurma;}
    public void setQtdAlunos(int qtdAlunos){this.qtdAlunos = qtdAlunos;}
    public void setNotas(double[] notas){this.notas = notas;}
    
    public double mediaTurma(){
        double soma = 0, media;
        for(int i = 0; i < notas.length ; i++){
            soma += notas[i];
        }
        return media = soma/notas.length;
    }
}
