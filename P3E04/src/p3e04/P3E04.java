/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3e04;

/**
 *
 * @author Gabihh
 */
public class P3E04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cosseno v = new Cosseno(2);
        v.calculaParcelas();
	v.somaParcelas();
	System.out.println("Cosseno = " + v.getCosseno());
        
    }
    
}
