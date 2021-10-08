/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herancapag182;

/**
 *
 * @author Gabihh
 */
public class Livro extends Produto{
    private String ISBN;
    
    public Livro(String codigo, 
            String descrição, 
            double precoCompra, 
            double precoVenda, String ISBN){
        super(codigo, descrição, precoCompra, precoVenda);
        this.ISBN = ISBN;
    }
    
    public double calculaLucro(){    
        double diferenca = precoVenda - precoCompra;
        return diferenca;
    }
    
    public String getISBN(){
        return this.ISBN = ISBN;
    }
}
