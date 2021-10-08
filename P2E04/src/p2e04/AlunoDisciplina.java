/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2e04;

/**
 *
 * @author Gabihh
 */
public class AlunoDisciplina {
    private int idAluno;
    private int idDisciplina;
    private double notaB1;
    private double notaB2;
    
    public AlunoDisciplina(){
    }
    public AlunoDisciplina(int idAluno, int idDisciplina, double notaB1, double notaB2){
        this.idAluno = idAluno;
        this.idDisciplina = idDisciplina;
        this.notaB1 = notaB1;
        this.notaB2 = notaB2;
    }
    
    public int getIdAluno(){
        return this.idAluno;
    }
    public int getIdDisciplina(){
        return this.idDisciplina;
    }
    public double getNotaB1(){
        return this.notaB1;
    }
    public double getNotaB2(){
        return this.notaB2;
    }
    public double getMediaAritmetica(){
        return (this.notaB1 + this.notaB2) / 2;
    }
    public double getMediaPonderada(){
        return ((this.notaB1*4) + (this.notaB2*6)) / (4 + 6);
    }
    
    public void setIdAluno(int idAluno){
        this.idAluno = idAluno;
    }
    public void setIdDisciplina(int idDisciplina){
        this.idDisciplina = idDisciplina;
    }
    public void setNotaB1(double notaB1){
        this.notaB1 = notaB1;
    }
    public void setNotaB2(double notaB2){
        this.notaB2 = notaB2;
    }
}
