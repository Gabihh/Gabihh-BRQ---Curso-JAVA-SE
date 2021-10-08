/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe07;

import java.text.DecimalFormat;

/**
 *
 * @author Gabihh
 */
public class Exe07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        Usando o operador condicional escreva a seguinte rotina para cálculo de 
        taxa de imposto de acordo com o valor da renda anual(rendaAnual);
        
        taxa0% se rendaAnual < 5000
        taxa10% se 5000 <= rendaAnual <10000
        taxa20% se 10000 <= rendaAnual < 20000
        taxa30% se 20000 <= rendaAnual
        */
        
        int rendaAnual = 20000;
        
        if(rendaAnual < 5000)
            System.out.println("TAXA DE 0%");
        else if(5000 <= rendaAnual && rendaAnual < 10000)
            System.out.println("TAXA DE 10%");
        else if(10000 <= rendaAnual && rendaAnual < 20000)
            System.out.println("TAXA DE 20%");
        else
            System.out.println("TAXA DE 30%");
    }
    
}
