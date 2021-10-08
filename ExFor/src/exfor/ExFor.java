/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exfor;

/**
 *
 * @author Gabihh
 */
public class ExFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int x;
        double cont = 1, s1 = 0;
        for(x = 1; x < 100; x++){
            if(x % 2 != 0){
                s1 += x/cont;
                cont++;
            }
        }
        
        System.out.println(s1);
        
        double cont2 = 50, s2 = 0;
        for(x = 1; x <= 50; x++){
            s2 += Math.pow(2, x)/cont2;
            cont2--;
        }
        
        System.out.println(s2);
        
        
        double s3 = 0, cont3 = 38;
        for(x = 1; x <= 37; x++){
            s3 += ((cont3 - 1) * cont3 )/x;
            cont3--;
        }
        
        System.out.println(s3);

        
        double s4 = 0, cont4 = 38, sinal = 1;
        for(x = 1; x <= 10; x++){
            s4 += sinal * (x / Math.pow(x, 2));
            sinal = sinal * (-1);
            cont4--;
        }
        
        System.out.println(s4);
    }
    
}
