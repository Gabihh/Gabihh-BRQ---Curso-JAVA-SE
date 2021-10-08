/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p5e02;

import java.util.Scanner;

/**
 *
 * @author Gabihh
 */
public class P5E02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Digite a opção de cadastro(CD/DVD): ");
        Scanner sc = new Scanner(System.in);
        String opcao = sc.nextLine();
            
        if("CD".equalsIgnoreCase(opcao)){
            Midia midia = new CD();
            midia.inserirDados();
            midia.printDados();
        }
        else{
            Midia midia = new DVD();
            midia.inserirDados();
            midia.printDados();
        }
        
        
    }
    
}
