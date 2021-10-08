/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3e02;

import java.util.ArrayList;

/**
 *
 * @author Gabihh
 */
public class Pesquisa {
    private static int sequencia;
    private int numPesquisa;
    private char sexo;
    private char resposta;

    public Pesquisa(char sexo, char resposta) {
	sequencia++;
        numPesquisa = sequencia;
	this.sexo = sexo;
        this.resposta = resposta;
    }
	
    public int getNumPesquisa(){return this.numPesquisa;}
    public char getSexo(){return this.sexo;}
    public char getResposta(){return this.resposta;}
    
    public void setNumPesquisa(int numPesquisa){this.numPesquisa = numPesquisa;}
    public void setSexo(char sexo){this.sexo = sexo;}
    public void setResposta(char resposta){this.resposta = resposta;}
	
    public static int qhrs(ArrayList al) {
        int qtde = 0;
	Pesquisa p;
        for(int i=0; i<al.size();i++) {
            p = (Pesquisa) al.get(i);
            if(p.getSexo()=='M' && p.getResposta()=='S')
                    qtde++;
        }
	return qtde;
    }
	
    public static int qmrn(ArrayList al) {
        int qtde = 0;
	Pesquisa p;
        for(int i=0; i<al.size();i++) {
            p = (Pesquisa) al.get(i);
            if(p.getSexo()=='F' && p.getResposta()=='N')
                qtde++;
        }
	return qtde;
    }
	
    public static double phrs(ArrayList al) {
        int qtde = 0;
	Pesquisa p;
        for(int i=0; i<al.size();i++) {
            p = (Pesquisa) al.get(i);
            if(p.getSexo()=='M')
                qtde++;
        }		
	return 100.0*qhrs(al)/qtde;
    }
	
    public static double pmrn(ArrayList al) {
        int qtde = 0;
        Pesquisa p;
	for(int i=0; i<al.size();i++) {
            p = (Pesquisa) al.get(i);
            if(p.getSexo()=='F')
                qtde++;
	}		
	return 100.0*qmrn(al)/qtde;
    }
}
