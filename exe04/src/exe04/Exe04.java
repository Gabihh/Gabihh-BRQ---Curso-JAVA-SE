/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe04;

/**
 *
 * @author Gabihh
 */
public class Exe04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int i = 1, j = 2, k = 3, n = 2;
        double x = 3.3, y = 4.4;
        
        System.out.println(i < j + 3);
        System.out.println(2 * i - 7 <= j -8);
        System.out.println(-x + y >= 2.0 * y);
        System.out.println(x == y);
        System.out.println(x != y);
        System.out.println(i + j + k == -2 * -k);
        System.out.println(i < j || 2 >= k);
        System.out.println(i < j && 2 >= k);
        System.out.println(i == 2 || j == 4 || k == 5);
        System.out.println(x <= 5.0 && x != 1.0 || i > j);
    }
    
}
