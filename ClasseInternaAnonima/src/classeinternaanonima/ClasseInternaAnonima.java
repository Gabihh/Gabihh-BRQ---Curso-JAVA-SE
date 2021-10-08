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
public class ClasseInternaAnonima {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CE souExterno = new CE();
        System.out.println(souExterno.getTxt());
        souExterno.imprime();
        
        // classe interna anônima
        CE souCIA = new CE(){
            private String txt3 = "Texto anônimo 3";

            // sobrescrever getTxt() da classe CE
            public String getTxt(){return this.txt3;}

            // sobrescrever imprime() da classe CE
            public void imprime(){
                System.out.println("C => " 
                        + txt3);
                CE x = new CE();
                System.out.println("D => " 
                        + x.getTxt());
            }
        }; // ponto-e-vírgula obrigatório
        
        souCIA.imprime();
        System.out.println("E => " 
                + souCIA.getTxt());
    }
    
}
