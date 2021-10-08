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
public class Produto {
    protected String codigo;
    protected String descricao;
    protected double precoCompra;
    protected double precoVenda;
  
    public Produto(String codigo, String descricao, double precoCompra, double precoVenda) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.precoCompra = precoCompra;
        this.precoVenda = precoVenda;
    }

    public String getCodigo(){
        return this.codigo = codigo;
    }
    public String getDescricao(){
        return this.descricao = descricao;
    }
    public double getPrecoCompra(){
        return this.precoCompra = precoCompra;
    }
    public double getPrecoVenda(){
        return this.precoVenda = precoVenda;
    }
}
