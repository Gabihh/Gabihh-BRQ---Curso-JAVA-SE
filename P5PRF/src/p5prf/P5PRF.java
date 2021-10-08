/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p5prf;

import java.util.Scanner;

/**
 *
 * @author Gabihh
 */
public class P5PRF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String lampada, onOff;
        
        System.out.println("Qual lâmpada de seja criar: (Incandescente/Fluorescente)");
        lampada = sc.nextLine();
        
        FabricaLampada lampadaCriada = new FabricaLampada(lampada);
        
        if("incandescente".equalsIgnoreCase(lampada))lampadaCriada.lampada();
        if("fluorescente".equalsIgnoreCase(lampada))lampadaCriada.lampada();
        
        System.out.println("Deseja Ligar/Desligar a lâpada: ");
        onOff = sc.nextLine();
        
        if("ligar".equalsIgnoreCase(onOff))lampadaCriada.ligar();
        if("desligar".equalsIgnoreCase(onOff))lampadaCriada.desligar();
    }
    
}
