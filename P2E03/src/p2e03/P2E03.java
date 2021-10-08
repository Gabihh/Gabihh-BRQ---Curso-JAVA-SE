/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2e03;

import java.util.Scanner;

/**
 *
 * @author Gabihh
 */
public class P2E03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);  
        
        int numeroConta;
        double saldo, depositar, sacar;
           
        System.out.print("Digite o número da conta corrente: ");
        numeroConta = Integer.parseInt(s.nextLine());
        
        System.out.print("Digite o valor do saldo da conta corrente: R$");
        saldo = Double.parseDouble(s.nextLine());
        
        ContaCorrente c = new ContaCorrente(numeroConta, saldo);
        
        System.out.println("\nNúmero da conta corrente: " + c.getNumCC());
        System.out.println("Saldo bancário: R$" + c.getSaldoCC());
        
        System.out.print("\nDigite o valor que deseja depositar: R$");
        depositar = Double.parseDouble(s.nextLine());
        c.setDepositar(depositar);
        System.out.println("\nNúmero da conta corrente: " + c.getNumCC());
        System.out.println("Saldo bancário: R$" + c.getSaldoCC());
        
        System.out.print("\nDigite o valor que deseja sacar: R$");
        sacar = Double.parseDouble(s.nextLine());
        c.setSacar(sacar);
        System.out.println("\nNúmero da conta corrente: " + c.getNumCC());
        System.out.println("Saldo bancário: R$" + c.getSaldoCC());
    }
    
}
