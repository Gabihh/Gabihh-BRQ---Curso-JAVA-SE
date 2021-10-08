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
public class Cachorro extends Animal {
    public Cachorro(){}
    public Cachorro(String especie,
            String nome){
        super(especie, nome);
    }
    
    public void som(){
        System.out.println("O " + getNome() + " faz Au Au!");
    }
}
