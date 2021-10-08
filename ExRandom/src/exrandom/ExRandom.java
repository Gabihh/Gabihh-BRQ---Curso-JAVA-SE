/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exrandom;

import java.util.Date;
import java.util.Random;

/**
 *
 * @author Gabihh
 */
public class ExRandom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random r = new Random(new Date().getTime());
        
        double altura, menorAltura = 99.9, maiorAltura = 0.0;
        int cont = 0;
        
        do{
            altura = r.nextGaussian()* 0.3 + 1.6;
            System.out.println("Altura: " + altura);
            if(altura < menorAltura){
                menorAltura = altura;
            }
            if(altura > maiorAltura){
                maiorAltura = altura;
            }
            
            cont++;
        }while(cont < 10);
        System.out.println("\nMenor Altura: " + menorAltura);
        System.out.println("Maior Altura: " + maiorAltura);
    }
    
}
