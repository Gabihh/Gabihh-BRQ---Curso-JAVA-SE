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
public class Pato implements AnimalInterface {
    private String especie;
    private String nome;
    
    public Pato(){}
    public Pato(String especie,
            String nome){
        this.especie = especie;
        this.nome = nome;
    }
    
    public String getEspecie(){return this.especie;}
    public String getNome(){return this.nome;}
    
    public void som(){
        System.out.println("O " + getNome() + " faz quack quack!");
    }
}
