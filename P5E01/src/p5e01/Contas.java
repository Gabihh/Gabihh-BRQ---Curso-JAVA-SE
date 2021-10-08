/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p5e01;

/**
 *
 * @author Gabihh
 */
public class Contas {
    public static void mostrarCalculo(OperacaoMatematica operacao, double x, double y){
            System.out.println("O resultado é: " 
                    + operacao.calcular(x, y));
    }
}
