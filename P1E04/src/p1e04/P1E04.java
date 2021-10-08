/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1e04;

/**
 *
 * @author Gabihh
 */
public class P1E04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        Escrever um programa que armazene um horário (hora, minuto e segundo) em 
        variáveis, depois determine e exiba a quantidade de segundos que se 
        passaram desde a 0h0min0s e a quiantidade de segundos que faltam para à 
        meia-noite.
        */
        
        int x, y, hora = 1, minuto = 0, segundo = 0, meia_noite = 86400;
        
        y = segundo + (hora * 3600) + (minuto * 60);
        x = meia_noite - y;
        
        System.out.println("Quantidade de segundos que passaram desde a 0h0min0s = " + y);
        System.out.println("Quantidade de segundos que faltam para meia-noite = " + x);
    }
    
}
