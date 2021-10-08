/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classeinternaestatica;

/**
 *
 * @author Gabihh
 */
public class CE {
    private static String txt1 = "Texto Estático";
    private String txt2 = "Texto não Estático";

    public String getTxt1(){return this.txt1;}
    public String getTxt2(){return this.txt2;}
    
    // Classe Interna Estática
    public static class CIE{
        // método não Estático
        public void imprime(){
            System.out.println("A 1 => " 
                    + txt1);
            System.out.println("A 2 => " 
                    + CE.txt1);
            CE x = new CE();
            System.out.println("A 3 => " 
                    + x.getTxt1());
        }
        // método Estático
        public static void imprimeEstatico(){
            System.out.println("B 1 => " 
                    + txt1);
            System.out.println("B 2 => " 
                    + CE.txt1);
            CE x = new CE();
            System.out.println("B 3 => " 
                    + x.getTxt1());
        }
    }
}
