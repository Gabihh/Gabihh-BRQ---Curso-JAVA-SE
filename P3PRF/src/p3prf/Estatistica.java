/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3prf;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Gabihh
 */
public class Estatistica {
    private double [] valores;
   
    public Estatistica(double [] valores){
        this.valores = valores;
    }
    
    public void ordena(){
        Arrays.sort(valores);
        System.out.print("\nValores em ordem crescente: ");
        for(double o : valores){
            System.out.print(o + "  ");
        }
    }
    
    public double media(){
        double soma = 0, media;
        for(int i = 0; i < valores.length; i++){
            soma += valores[i];
        }
        return media = soma / valores.length;
    }
    
    public ArrayList moda(){ 
        ArrayList moda = new ArrayList();
        Arrays.sort(valores);
        for(int i = 0; i < valores.length; i++){
            for(int j = (i + 1); j < valores.length; j++){
                if(valores[j] == valores[i]){
                    if(!(moda.contains(valores[i]))){
                        moda.add(valores[i]);
                    } 
                }
            }          
        }
        return moda;
    }
    
    public double mediana(){
        double mediana = 0; 
        int m;
        Arrays.sort(valores);
        if(valores.length % 2 == 0){
            m = valores.length / 2;
            for(int i = (m - 1); i < (m + 1); i++){
                mediana += valores[i];
            }
            mediana = mediana / 2;
        }
        else{
            m = valores.length / 2;
            mediana = valores[m];
        }
        return mediana;
    }
    
    public double variancia(){
        double variancia = 0, v = 0;
        for(int i = 0; i < valores.length; i++){
            v += Math.pow((valores[i] - media()), 2);
        }
        return variancia = v / valores.length;
    }
    
    public double desvioPadrao(){
        double desvioPadrao;
        return desvioPadrao = Math.pow(variancia(), 2);
    }
}
