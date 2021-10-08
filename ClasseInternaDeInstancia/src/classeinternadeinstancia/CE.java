/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classeinternadeinstancia;

/**
 *
 * @author Gabihh
 */
public class CE {
    private String txt1 = "Texto Externo";

    public String getTxt1(){return this.txt1;}

    // Classe Interna de Instância
    public class CII{
        private String txt2 = "Texto Interno";
        public void imprime(){
            System.out.println("interno 1 => " + txt1);
            System.out.println("interno 1 => " + txt2);
            CE x = new CE();
            System.out.println("interno 1 => " + x.getTxt1());
        }
    }
}
