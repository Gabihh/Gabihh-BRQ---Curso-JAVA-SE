/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gab;

/**
 *
 * @author Gabihh
 */
public class GAB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Funcionario p = new Programador(1, "Gabriela", "Bancos", "SQL");
        //p.trabalhar();
        
        Funcionario a = new Analista(1, "Gabriela", "Teste");
        //a.trabalhar();
        
        Funcionario g = new Gerente(1, "Gabriela", "Bancos", 10, 10);
        //g.trabalhar();
        
        Mostrar t = new Mostrar();
        t.mostrar(g);
        t.mostrar(a);
        t.mostrar(p);
    }
    
}
