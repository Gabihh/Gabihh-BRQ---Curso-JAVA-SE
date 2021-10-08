/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lacoderepeticao;

import java.util.Scanner;


/**
 *
 * @author Gabihh
 */
public class LacoDeRepeticao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        
        //---------------------------------------------------------------------
        // WHILE - Atividade pag 127 ex 01
        
        /*int qtdPessoas = 0;
        double somaAltura = 0.0, altura, mediaAltura;
       
        
        while(qtdPessoas < 10){
            System.out.print("Digite a altura: ");
            altura = Double.parseDouble(s.nextLine());
            somaAltura += altura;
            qtdPessoas ++;
        }
        mediaAltura = somaAltura / qtdPessoas;
        System.out.println("Altura média: " + mediaAltura);
        */
        
        //---------------------------------------------------------------------
        // FOR - Atividade pag 127 ex 01
        
        /*int qtdPessoa;
        double somaAltura = 0.0, altura, mediaAltura;
        
        for(qtdPessoa = 0; qtdPessoa < 10; qtdPessoa++){
            System.out.print("Digite a altura: ");
            altura = Double.parseDouble(s.nextLine());
            somaAltura += altura;
        }
        mediaAltura = somaAltura / qtdPessoa;
        System.out.println("Altura média: " + mediaAltura);
        */
        
        //---------------------------------------------------------------------
        // WHILE - Atividade pag 128 ex 02
        
        /*int qtdAluno = 0;
        String acabou = "NAO";
        double soma = 0, n1, n2, media, mediaClasse;
        
        while(acabou.equalsIgnoreCase("NAO")){
            System.out.print("\nDigite a 1° nota: ");
            n1 = Double.parseDouble(s.nextLine());
            System.out.print("Digite a 2° nota: ");
            n2 = Double.parseDouble(s.nextLine());
            media = (n1 + n2)/2;
            System.out.println("Média Aluno: " + media);
            soma = soma + media;
            qtdAluno++;
            System.out.print("Acabou? SIM/NAO  ");
            acabou = s.nextLine();
        }
        
        mediaClasse = soma / qtdAluno;
        System.out.println("\nMedia Classe: " + mediaClasse);
        */
        
        //---------------------------------------------------------------------
        // DO/WHILE - Atividade pag 129
        
        String nome, menorNome = "";
        double altura, menorAltura = 99;
        int cont = 0;
        
        do{
            System.out.print("\nDigite o nome.....: ");
            nome = s.nextLine();
            System.out.print("Digite a altura...: ");
            altura = Double.parseDouble(s.nextLine());
            
            if(altura < menorAltura){
                menorAltura = altura;
                menorNome = nome;
            }
            
            cont++;
        }while(cont < 10);
        
        System.out.println("\n-- Pessoa com menor altura --");
        System.out.println("Nome.......: " + menorNome);
        System.out.println("Altura.....: " + menorAltura);
        
        s.close();
    }
}
