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
public class Gerente extends Funcionario {
    private String setor;
    private int qtdAnalista;
    private int qtdProgramador;
    
    public Gerente(){}
    public Gerente(int idFunc,
            String nomeFunc,
            String setor,
            int qtdAnalista,
            int qtdProgramador){
        super(idFunc, nomeFunc);
        this.setor = setor;
        this.qtdAnalista = qtdAnalista;
        this.qtdProgramador = qtdProgramador;
    }
    
    public String getSetor(){return this.setor;}
    public int getQtdAnalista(){return this.qtdAnalista;}
    public int getQtdProgramador(){return this.qtdProgramador;}
    
    public void setSetor(String setor){this.setor = setor;}
    public void setQtdAnalista(int qtdAnalista){this.qtdAnalista = qtdAnalista;}
    public void setQtdProgramador(int qtdProgramador){this.qtdProgramador = qtdProgramador;}
    
    public void trabalhar(){
        System.out.println("O gerente " + getNomeFunc()
                + " gerencia o setor " + getSetor()
                + " com " + getQtdAnalista() 
                + " analistas e " + getQtdProgramador()
                + " programadores.");
    }
}
