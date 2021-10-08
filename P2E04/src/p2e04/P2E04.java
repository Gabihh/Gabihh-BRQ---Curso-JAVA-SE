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
public class P2E04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        AlunoDisciplina a1 = new AlunoDisciplina();
        AlunoDisciplina a2 = new AlunoDisciplina(2, 1, 10, 10);
        a1.setIdAluno(1);
        a1.setIdDisciplina(1);
        a1.setNotaB1(5);
        a1.setNotaB2(2);
        
        System.out.println("ID Aluno: " + a1.getIdAluno()
                            + " || ID Disciplina: " + a1.getIdDisciplina()
                            + " || Nota do 1° Bimestre: " + a1.getNotaB1()
                            + " || Nota do 2° Bimestre: " + a1.getNotaB2());
     
        System.out.println("ID Aluno: " + a2.getIdAluno()
                            + " || ID Disciplina: " + a2.getIdDisciplina()
                            + " || Nota do 1° Bimestre: " + a2.getNotaB1()
                            + " || Nota do 2° Bimestre: " + a2.getNotaB2());
        
        System.out.println("ID Aluno: " + a1.getIdAluno()
                            + " || ID Disciplina: " + a1.getIdDisciplina()
                            + " || Media Aritmetica: " + a1.getMediaAritmetica()
                            + " || Media Ponderada: " + a1.getMediaPonderada());
        
        System.out.println("ID Aluno: " + a1.getIdAluno()
                            + " || ID Disciplina: " + a1.getIdDisciplina()
                            + " || Media Aritmetica: " + a2.getMediaAritmetica()
                            + " || Media Ponderada: " + a2.getMediaPonderada());
    }
    
}
