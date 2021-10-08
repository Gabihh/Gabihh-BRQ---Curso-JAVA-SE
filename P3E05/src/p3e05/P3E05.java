/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3e05;

/**
 *
 * @author Gabihh
 */
public class P3E05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        boolean [] primo = new boolean[10];
        
        for(int i = 0; i < primo.length; i++){
            primo[i] = true;
            System.out.print(i + " = ");
            System.out.println(primo[i]);
        }
        
        System.out.println("\nNúmeros primos continuam valendo true: ");
        
        for(int i = 0; i < primo.length; i++){
            int d = 2;
            int rq = (int) Math.sqrt(i);
            
            while(i%d!=0 && d <= rq){
                d++;
            }
            
            if(d<=rq || i < 2){
                primo[i] = false;
            }
            System.out.print( + i + " = ");
            System.out.println(primo[i]);
        }
    }
    
}
