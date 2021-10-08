/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p4e05;

import java.util.Scanner;

/**
 *
 * @author Gabihh
 */
public class NumeroInteiro {
    Scanner sc = new Scanner(System.in);
    int inteiro;
    boolean erro = false;
    
    public void numeroInteiro(){
        do{
            try {
                System.out.print("Digite um inteiro: ");
                inteiro = Integer.parseInt(sc.nextLine());
                System.out.println("Você digitou " + inteiro + ".");
                erro = false;
            }
            catch(NumberFormatException e){
                System.out.print("Este não é um inteiro numérico!");
                erro = true;
                sc.nextLine();
            }
        }
        while(erro);
    }
}
