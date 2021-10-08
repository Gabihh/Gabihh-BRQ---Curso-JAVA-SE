/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3e01;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Gabihh
 */
public class P3E01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        ArrayList p = new ArrayList(4);
        int id;
        String nome, resposta;
        double altura;
        
        do{
            System.out.print("Digite o ID: ");
            id = Integer.parseInt(sc.nextLine());
            System.out.print("Digite o Nome: ");
            nome = sc.nextLine();
            System.out.print("Digite a Altura: ");
            altura = Double.parseDouble(sc.nextLine());
            p.add(new Pessoa(id, nome, altura));
            System.out.print("\nDeseja cadastrar outra pessoa: ");
            resposta = sc.nextLine();
        }while(resposta.equalsIgnoreCase("SIM"));

        
        System.out.println("\nMédia de Altura: " + Pessoa.mediaAltura(p));
        
    }  
    
}
