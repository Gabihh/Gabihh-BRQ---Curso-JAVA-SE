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
public class CD extends Midia {
    private int nMusicas;
    
    public CD(){super();}
    public CD(int codigo,
            double preco,
            String nome,
            int nMusicas){
        super(codigo, preco, nome);
        this.nMusicas = nMusicas;
    }

    @Override
    public String getTipo(){
        return "\nCD: ";
    }
    
    @Override
    public String getDetalhes(){
        return super.getDetalhes() + "Número de músicas: " + nMusicas + "\n";
    }
    
    public void setMusicas(int nMusicas){
        this.nMusicas = (nMusicas > 0) ? nMusicas : 0;
    }
    
    public void inserirDados(){
        super.inserirDados();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Entre com o número de músucas: ");
        int nMus = Integer.parseInt(sc.nextLine());
        
        setMusicas(nMus);
    }
}
