/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p5e02;

import java.util.Scanner;

/**
 *
 * @author Gabihh
 */
public class Midia {
    protected int codigo;
    protected double preco;
    protected String nome;
    
    public Midia(){}
    public Midia(int codigo,
            double preco,
            String nome){
        this.codigo = codigo;
        this.preco = preco;
        this.nome = nome;
    }
    
    public int getCodigo(){return this.codigo;}
    public double getPreco(){return this.preco;}
    public String getNome(){return this.nome;}
    
    public void setCodigo(int codigo){this.codigo = codigo;}
    public void setPreco(double preco){this.preco = preco;}
    public void setNome(String nome){this.nome = nome;}
    
    public String getTipo(){
        return "Midia: ";
    }
    
    public String getDetalhes(){
        return "Código: " + getCodigo() + "\n" +
                "Preço: " + getPreco() + "\n" +
                "Nome: " + getNome() + "\n";
    }
    
    public void printDados(){
        String s = getTipo() + "\n" + getDetalhes() + "\n";
        System.out.println(s);
    }
    
    public void inserirDados(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Entre com o código: ");
        int cod = Integer.parseInt(sc.nextLine());
        System.out.print("Entre com o preço: ");
        double pre = Double.parseDouble(sc.nextLine());
        System.out.print("Entre com o nome: ");
        String nm = sc.nextLine();
        
        setCodigo(cod);
        setPreco(pre);
        setNome(nm);
    }
}
