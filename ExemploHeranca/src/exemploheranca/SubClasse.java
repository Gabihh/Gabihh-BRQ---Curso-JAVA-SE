/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploheranca;

/**
 *
 * @author Gabihh
 */
public class SubClasse extends SuperClasse{
    // construtor sem parâmetros (default)
    public SubClasse(){
        System.out.println("SubClasse sem parâmetro");
    }
    // construtor com parâmetros
    public SubClasse(int a){
        super(a);
        System.out.println("SubClasse com parâmetro => "+ a);
    }
}
