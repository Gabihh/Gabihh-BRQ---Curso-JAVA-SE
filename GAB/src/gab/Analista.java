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
public class Analista extends Funcionario {
    private String sistema;
    
    public Analista(){}
    public Analista(int idFunc,
            String nomeFunc,
            String sistema){
        super(idFunc, nomeFunc);
        this.sistema = sistema;
    }
    
    public String getSistema(){return this.sistema;}
    public void setSistema(String sistema){this.sistema = sistema;}
    
    public void trabalhar(){
        System.out.println("O analista " + getNomeFunc()
                + " desenvolve software para o sistema "
                + getSistema());
    }
}
