/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3e01;

import java.util.ArrayList;

/**
 *
 * @author Gabihh
 */
public class Pessoa {
    private int idPessoa;
    private String nomePessoa;
    private double alturaPessoa;
    
    public Pessoa(){
    }
    
    public Pessoa(int idPessoa, String nomePessoa, double alturaPessoa){
        this.idPessoa = idPessoa;
        this.nomePessoa = nomePessoa;
        this.alturaPessoa = alturaPessoa;
    }
    
    public int getIdPessoa(){
        return this.idPessoa;
    }
    public String getNomePessoa(){
        return this.nomePessoa;
    }
    public double getAlturaPessoa(){
        return this.alturaPessoa;
    }
    
    public void setIdPessoa(int idPessoa){
        this.idPessoa = idPessoa;
    }
    public void setNomePessoa(String nomePessoa){
        this.nomePessoa = nomePessoa;
    }
    public void setAlturaPessoa(double alturaPessoa){
        this.alturaPessoa = alturaPessoa;
    }    
    
    public static double mediaAltura(ArrayList pessoa){
        double soma = 0, media, qtd = 0;
        Pessoa p;
        for(int i=0; i<pessoa.size();i++) {
            p = (Pessoa) pessoa.get(i);
            soma += p.getAlturaPessoa();
            qtd++;
        }
        return media = soma / qtd;
    }
}


