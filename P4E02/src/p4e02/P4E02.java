/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p4e02;

import java.text.DecimalFormat;

/**
 *
 * @author Gabihh
 */
public class P4E02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DecimalFormat formato = new DecimalFormat("#.##");
        Funcionario f = new Funcionario("Gabriela", "12121212", 11000);
        Chefe c = new Chefe("Gabriela", "145236", 11000, 1000, 100, 500);
        
        System.out.println("Salário do funcionário: R$" + formato.format(f.pagamento()));
        System.out.println("Salário do chefe: R$" + formato.format(c.pagamento()));
        System.out.println("Salário do chefe com adicional e custos: R$" + formato.format(c.pagamentoExtra()));
    }
    
}
