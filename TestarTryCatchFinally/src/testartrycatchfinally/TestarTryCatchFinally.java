/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testartrycatchfinally;

import java.util.Scanner;

/**
 *
 * @author Gabihh
 */
public class TestarTryCatchFinally {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        boolean erro=false;

        do {
            try {
                System.out.print("Digite sua idade :");
                int idade = sc.nextInt();
                erro = false;
            }
            catch(Exception e){
                System.out.println("Você informou a idade errada!");
                erro = true;
                sc.nextLine();
            }
            finally{
                if (erro)
                    System.out.println("Tente Novamente!");
                else
                    System.out.println("Obrigado!");
            }
        } while (erro);
    }
    
}
