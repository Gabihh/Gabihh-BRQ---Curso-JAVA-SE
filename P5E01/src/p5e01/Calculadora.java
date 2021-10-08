/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p5e01;

import java.util.Scanner;

/**
 *
 * @author Gabihh
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String operacao;
        double x, y;
        
        System.out.println("Bem-vindo ao sistema de CALCULADORA");
        System.out.println("Soma Subtração Multiplicacao Divisao Resto");
        System.out.print("Digite a operação que deseja: ");
        operacao = sc.nextLine();
        System.out.print("Digite o primeiro valor:");
        x = Double.parseDouble(sc.nextLine());
        System.out.print("Digite o segundo valor:");
        y = Double.parseDouble(sc.nextLine());
        
        switch(operacao){
            case "Soma": 
                Contas.mostrarCalculo(new Soma(), x, y); 
                break;
            case "Subtracao": 
                Contas.mostrarCalculo(new Subtracao(), x, y); 
                break;
            case "Multiplicacao": 
                Contas.mostrarCalculo(new Multiplicacao(), x, y); 
                break;
            case "Divisao": 
                Contas.mostrarCalculo(new Divisao(), x, y);
                break;
            case "Resto": 
                Contas.mostrarCalculo(new Resto(), x, y);
                break;
            default:
                System.out.println("Operação não encontrada!");
        }
    }
    
}
