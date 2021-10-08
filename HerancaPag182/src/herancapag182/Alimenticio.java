/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herancapag182;

import java.util.Date;

/**
 *
 * @author Gabihh
 */
public class Alimenticio extends Produto{
    private Date dataFabricacao;
    private Date dataValidade;
    private double imposto;
    
    public Alimenticio(String codigo, 
            String descrição, 
            double precoCompra, 
            double precoVenda, 
            Date dataFabricacao, 
            Date dataValidade, 
            double imposto){
        super(codigo, descrição, precoCompra, precoVenda);
        this.dataFabricacao = dataFabricacao;
        this.dataValidade = dataValidade;
    }
    
    public double calculaLucro(){
        double diferenca = precoVenda - precoCompra;
        double lucro = diferenca - (precoVenda * imposto);
        return lucro;
    }
    
    public Date getDataFabricacao(){
        return this.dataFabricacao = dataFabricacao;
    }
    public Date getDataValidade(){
        return this.dataValidade = dataValidade;
    }
    public double getImposto(){
        return this.imposto = imposto;
    }
}
