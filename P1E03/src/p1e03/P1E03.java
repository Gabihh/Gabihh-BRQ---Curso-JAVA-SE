/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1e03;

import java.text.DecimalFormat;

/**
 *
 * @author Gabihh
 */
public class P1E03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        Escrever um programa que com baseem uma temperatura em graus célsius(C),
        a converta e exiba em kelvin(K), fahrenheit(F), Réaumur(Re) e Rankine(Ra).
        Utilize as fórmulas abaixo:
        
        F = C * 1.8 + 32
        K = C + 273.15
        Ra = C * 1.8 + 32 + 459.67
        Re = c * 0.8
        */
           
        DecimalFormat d = new DecimalFormat("#.##");
        double c = 40, f, k, ra, re;
        
        f = c * 1.8 + 32;
        k = c + 273.15;
        ra = c * 1.8 + 32 + 459.67;
        re = c * 0.8;
        
        System.out.println("Célsius(C) = " + d.format(c) + "°");
        System.out.println("Kelvin(K) = " + d.format(k) + "°");
        System.out.println("Fahrenheit(F) = " + d.format(f) + "°");
        System.out.println("Réaumur(Re) = " + d.format(re) + "°");
        System.out.println("Rankine(Ra) = " + d.format(ra) + "°");    
    }
    
}
