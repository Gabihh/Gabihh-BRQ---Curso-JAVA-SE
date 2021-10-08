/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploherancapag179;

/**
 *
 * @author Gabihh
 */
public class ExemploHerancaPag179 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        Funcionario F01 = new Funcionario(323,"Pedro da Costa",35.00);
        Estagiario E01 = new Estagiario(548,"Miranda Lima",22.00);
        System.out.println("Salario Funcionário = " +
        F01.calculaSalario(160));
        System.out.println("Salario Estagiário = " +
        E01.calculaSalario(120));
        System.out.println("Bonificação Funcionário = " +
        F01.bonificacao());
        System.out.println("Bonificação Estagiário = " +
        E01.bonificacao());
    }
    
}
