/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fazendafeliz;

/**
 *
 * @author Gabihh
 */
public abstract class Animal {
    protected String especie;
    protected String nome;
    
    public Animal(){}
    public Animal(String especie,
            String nome){
        this.especie = especie;
        this.nome = nome;
    }
    
    public String getEspecie(){return this.especie;}
    public String getNome(){return this.nome;}
    
    public void setEspecie(String especie){this.especie = especie;}
    public void setNome(String nome){this.nome = nome;}
    
    public abstract void som();
}
