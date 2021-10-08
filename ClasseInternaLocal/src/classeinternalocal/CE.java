/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classeinternalocal;

/**
 *
 * @author Gabihh
 */
public class CE {
    private String txt1 = "Texto Externo 1";

    public String getTxt1(){return this.txt1;}

    public void imprimeCE(){
        // variáveis locais do método
        String txt2 = "Texto Interno 2";
        final String txt3 = "Texto final 3";
        System.out.println("A => " + txt1);
        System.out.println("B => " + txt2);
        System.out.println("C => " + txt3);

        //Classe Interna Local
        class CIL{
            private String txt4 = "Texto Interno 4";
            public String getTxt4(){return this.txt4;}
        
            public void imprimeCIL(){
                System.out.println("D => " + txt3);
                System.out.println("E => " + txt4);
                CE x = new CE();
                System.out.println("F => " + x.getTxt1());
            }
        }
        
        // instanciando a classe interna local no método
        CIL souCIL = new CIL();
        souCIL.imprimeCIL();
        System.out.println("G => " + souCIL.getTxt4());
    }
}
