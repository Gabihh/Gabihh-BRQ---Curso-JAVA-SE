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
public class DVD extends Midia{
    private int nFaixa;
    
    public DVD(){super();}
    public DVD(int codigo,
            double preco,
            String nome,
            int nFaixa){
        super(codigo, preco, nome);
        this.nFaixa = nFaixa;
    }
    
    @Override
    public String getTipo(){
        return "\nDVD: ";
    }
    
    @Override
    public String getDetalhes(){
        return super.getDetalhes() + "Número de faixas: " + nFaixa + "\n";
    }
    
    public void setFaixas(int nFaixas){
        this.nFaixa = (nFaixas > 0) ? nFaixas : 0;
    }
    
    public void inserirDados(){
        super.inserirDados();
        
            Scanner sc = new Scanner(System.in);
            
            System.out.print("Entre com o número de faixas: ");
            int nFai = Integer.parseInt(sc.nextLine());
            setFaixas(nFai);
    }
}
