/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1e02;

import java.text.DecimalFormat;

/**
 *
 * @author Gabihh
 */
public class P1E02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        Escreva um programa que converta e exiba em reais o valr das moedas de 
        dólar contidas em um cofrinho com: 
        
        q1 moedas de $1
        q2 moedas de 50$
        q3 moedas de 25$
        q4 moedas de 10$
        q5 moedas de 5$
        q6 moedas de 1$
        
        Com a cotação do dólar em D, através da fórmula: 
        R = (q1 + 0.5 * q2 + 0.25 * q3 + 0.1 * q4 + 0.05 * q5 + 0.01 * q6) * D; 
        */
        
        DecimalFormat f = new DecimalFormat("#.##");
        int q1 = 5, q2 = 10, q3 = 15, q4 = 20, q5 = 25, q6 = 30;
        double D = 5.23, R;
        
        R = (q1 + 0.5 * q2 + 0.25 * q3 + 0.1 * q4 + 0.05 * q5 + 0.01 * q6) * D; 
        System.out.println("O valor total das moedas de Dólar em Real é = R$" + f.format(R));
    }
    
}
