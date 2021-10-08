/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1e01;

/**
 *
 * @author Gabihh
 */
public class P1E01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /* 
        Escreva um programa para determinar a quantidade de cavalos necessários
        para levantar uma massa de m quilogramas a uma altura de h metros em t 
        segundos, através da fórmula: cavalos = m*h/t/745,6999
        */
        
        double m = 1000, h = 100, t = 10, cavalos;
        cavalos = m * h / t / 745.6999;
        System.out.println("Para levantar uma massa de " + m + 
                " quilogramas a uma altura de " + h + 
                " em " + t +
                " segundos, serão necessários " + Math.round(cavalos) +
                " cavalos.");
    }
    
}
