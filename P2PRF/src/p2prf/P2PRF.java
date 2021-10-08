/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2prf;

/**
 *
 * @author Gabihh
 */
public class P2PRF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculadora c = new Calculadora();
        
        System.out.println("Valor armazenado na memória: " + c.getExibeMemoria());
        System.out.println("Valor armazenado na memória ao somar 2: " + c.getSoma(2));
        System.out.println("Valor armazenado na memória: " + c.getExibeMemoria());
        System.out.println("Valor armazenado na memória ao subtrair 3: " + c.getSubtracao(3));
        System.out.println("Valor armazenado na memória: " + c.getExibeMemoria());
        System.out.println("Valor armazenado na memória ao multiplicar 4: " + c.getMultiplicacao(4));
        System.out.println("Valor armazenado na memória: " + c.getExibeMemoria());
        System.out.println("Valor armazenado na memória ao dividir 5: " + c.getDivisao(5));
        System.out.println("Valor armazenado na memória: " + c.getExibeMemoria());
    }
    
}
