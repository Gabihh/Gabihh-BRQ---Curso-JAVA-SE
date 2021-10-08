/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classeinternaanonima;

/**
 *
 * @author Gabihh
 */
public class CE {
    private String txt1 = "Texto Externo 1";

    public String getTxt(){return this.txt1;}

    public void imprime(){
        String txt2 = "Texto Externo 2";
        System.out.println("A => " + txt1);
        System.out.println("B => " + txt2);
    }
}
