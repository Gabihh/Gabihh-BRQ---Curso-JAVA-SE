/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe03;

/**
 *
 * @author Gabihh
 */
public class Exe03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        Encontre o valor que será atribuído à variável x, levando em conta a 
        declaração e inicialização de variáveis abaixo:
        */
        
        int x, a = 1, b = 2, c = 3, d = 4;
        x = a += b + c;
        System.out.println(x);
        
        x = 0; a = 1; b = 2; c = 3; d = 4;
        x = b *= c = d + 2;
        System.out.println(x);
        
        x = 0; a = 1; b = 2; c = 3; d = 4;
        x = d %= a + + a + a;
        System.out.println(x);
        
        x = 0; a = 1; b = 2; c = 3; d = 4;
        x = d -= c -= b -= a;
        System.out.println(x);
        
        x = 0; a = 1; b = 2; c = 3; d = 4;
        x = a += b += c += d += 7;
        System.out.println(x);
    }
    
}
