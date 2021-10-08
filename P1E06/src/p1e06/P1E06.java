/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1e06;

import java.text.DecimalFormat;

/**
 *
 * @author Gabihh
 */
public class P1E06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        Elabore um programa para armazenar uma medida de raio em metros, 
        determinar e exibir o perímetro e a área de um círculo com esse raio, 
        através das fórmulas:
        perimetro = 2 * 3.14159 * raio;
        area = 3.14159 * raio elevado a 2
        */
        
        DecimalFormat d = new DecimalFormat("#.##");
        double raio = 10, perimetro, area;
        
        perimetro = 2 * 3.14159 * raio;
        area = 3.14159 * Math.pow(raio, 2);
        
        System.out.println("Perímetro do círculo = " + d.format(perimetro));
        System.out.println("Área do círculo = " + d.format(area));
    }
    
}
