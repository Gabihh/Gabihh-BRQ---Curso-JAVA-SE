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
public abstract class Funcionario {
    protected int idFunc;
    protected String nomeFunc;
    
    public Funcionario(){}
    public Funcionario(int idFunc,
            String nomeFunc){
        this.idFunc = idFunc;
        this.nomeFunc = nomeFunc;
    }
    
    public abstract void trabalhar();
    
    public int getIdFunc(){return this.idFunc;}
    public String getNomeFunc(){return this.nomeFunc;}
    
    public void setIdFunc(int idFunc){this.idFunc = idFunc;}
    public void setNomeFunc(String nomeFunc){this.nomeFunc = nomeFunc;}
}
