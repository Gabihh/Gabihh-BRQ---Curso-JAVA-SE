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
public class Programador extends Funcionario {
    private String setor;
    private String linguagem;
    
    public Programador(){}
    public Programador(int idFunc,
            String nomeFunc,
            String setor,
            String linguagem){
        super(idFunc, nomeFunc);
        this.setor = setor;
        this.linguagem = linguagem;
    }
    
    public String getSetor(){return this.setor;}
    public String getLinguagem(){return this.linguagem;}
    
    public void setSetor(String setor){this.setor = setor;}
    public void setLinguagem(String linguagem){this.linguagem = linguagem;}
    
    public void trabalhar(){
        System.out.println("O programador " + getNomeFunc()
                + " trabalha no setor " + getSetor()
                + " desenvolvendo software na linguagem " + getLinguagem());
    }
}
