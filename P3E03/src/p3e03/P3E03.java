/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3e03;

import java.util.Scanner;

/**
 *
 * @author Gabihh
 */
public class P3E03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int id, qtd;
        
        System.out.print("Digite o ID da Turma: ");
        id = Integer.parseInt(sc.nextLine());
        System.out.print("Digite a quantidade de alunos: ");
        qtd = Integer.parseInt(sc.nextLine());
        System.out.println("");
        
        double [] notas = new double [qtd];
        for(int i = 0; i < notas.length; i++){
            System.out.print("Digite a nota do " + (i + 1) + "° aluno: ");
            notas[i] = Double.parseDouble(sc.nextLine());
        }
        
        Turma t = new Turma(id, qtd, notas);
        System.out.println("\nMédia da classe: " + t.mediaTurma());
    }
    
}
