/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3e02;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Gabihh
 */
public class P3E02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList ibope = new ArrayList();
        fazPesquisa(1000,ibope);
        System.out.println("Qtd. Homens responderam sim   = " + Pesquisa.qhrs(ibope));
        System.out.println("Qtd. Mulheres responderam não = " + Pesquisa.qmrn(ibope));
        System.out.println("% Homens responderam sim      = " + Pesquisa.phrs(ibope));
        System.out.println("% Mulheres responderam não    = " + Pesquisa.pmrn(ibope));        
	}
	
	public static void fazPesquisa(int qtde, ArrayList al) {
		Random ml = new Random();
		char sexo,resposta;
		for(int i=0; i< qtde; i++) {
			sexo = ml.nextBoolean()?'M':'F';
			resposta = ml.nextBoolean()?'S':'N';
			al.add(new Pesquisa(sexo,resposta));
		}
	} 
}
