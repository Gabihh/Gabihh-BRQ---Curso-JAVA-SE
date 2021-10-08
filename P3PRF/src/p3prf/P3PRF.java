/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3prf;

import java.util.Scanner;

/**
 *
 * @author Gabihh
 */
public class P3PRF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int qtd;
        
        System.out.print("Digite a quantidade de valores que será solicitado: ");
        qtd = Integer.parseInt(sc.nextLine());
        double [] v = new double[qtd];
        
        for(int i = 0; i < qtd; i++){
            System.out.print("Digite o valor: ");
            v[i] = Double.parseDouble(sc.nextLine());
        }
        
        Estatistica e = new Estatistica(v);
        e.ordena();
        System.out.println("\nMedia dos valores: " + e.media());
        System.out.println("Moda dos valores: " + e.moda());
        System.out.println("Mediana dos valores: " + e.mediana());
        System.out.println("Variância dos valores: " + e.variancia());
        System.out.println("Desvio Padrão dos valores: " + e.desvioPadrao());
    }
    
}
