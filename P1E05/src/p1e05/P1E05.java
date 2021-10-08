/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1e05;

import java.text.DecimalFormat;

/**
 *
 * @author Gabihh
 */
public class P1E05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        Escreva um programa que determine a quantidade de litros de água são 
        necessários para preencher uma piscina oval com profundidade variável.
        A fórmula é: 
        PM = (PP + PG)/2
        QTDLITROS = DG * DP * PM * 785
        */
        DecimalFormat d = new DecimalFormat("#.##");
        double dp = 10, dg = 10, pp = 10, pm = 10, pg = 10, qtd_litros;
        
        pm = (pp + pg)/2;
        qtd_litros = dg * dp * pm * 785;
        
        System.out.println("Quantidade de litros de água são necessários para preencher uma piscina = " 
                + d.format(qtd_litros));
    }
    
}
