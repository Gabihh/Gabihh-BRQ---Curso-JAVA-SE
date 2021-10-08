/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2e05;

/**
 *
 * @author Gabihh
 */
public class P2E05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Relogio r = new Relogio();
        r.setHora(12);
        r.setMinuto(0);
        r.setSegundo(0);
        
        System.out.print("Horário Atual: "); 
        r.getExibirHorario();
        System.out.print("Foi adiantando 5 segundo: ");
        r.setAdiantar(5);
        r.getExibirHorario();
        System.out.print("Foi atrasado 5 dias: ");
        r.setAtrasar(5*86400);
        r.getExibirHorario();
    }
    
}
