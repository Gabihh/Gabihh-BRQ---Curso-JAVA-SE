/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1prf;

/**
 *
 * @author Gabihh
 */
public class P1PRF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        Escreva um programa para calcular e exibir o dia e o mês de PASCOA para 
        um dado ano informando na variável ANO, usando o algoritmo de JEAN MEEUS.
        Todas as variáveis devem ser inteiras.
        */
        
        int a, b, c, d, e, f, g, h, i, j, k, l, mes, dia, ano = 2023;
        
        a = ano % 19;
        b = ano / 100;
        c = ano % 100;
        d = b / 4;
        e = b % 4;
        f = (b + 8)/25;
        g = (b - f + 1)/3;
        h = (19 * a + b - d - g + 15)%30;
        i = c / 4;
        j = c % 4;
        k = (32 + 2 * e + 2 * i - h - j)%7;
        l = (a + 11 * h + 22 * k)/451;
        mes = (h + k - 7 * l + 114)/31;
        dia = ((h + k - 7 * l + 114)%31)+1;
        
        System.out.println("A PÁSCOA será = " + dia + "/" + mes + "/" + ano);
    }
    
}
