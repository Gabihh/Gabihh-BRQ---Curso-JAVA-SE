/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosrandomicos;

import java.util.Date;
import java.util.Random;

/**
 *
 * @author Gabihh
 */
public class NumerosRandomicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Random mariaLouca = new Random();

        Date coelhoBranco = new Date();
        long semente = coelhoBranco.getTime();

        mariaLouca.setSeed(semente);
        int i = mariaLouca.nextInt();
        int r = mariaLouca.nextInt(10);
        double d = mariaLouca.nextDouble();
        double g = mariaLouca.nextGaussian();
        boolean b = mariaLouca.nextBoolean();

        System.out.println("i = " + i);
        System.out.println("r = " + r);
        System.out.println("d = " + d);
        System.out.println("g = " + g);
        System.out.println("b = " + b);
    }
    
}
