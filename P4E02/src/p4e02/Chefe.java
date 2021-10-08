/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p4e02;

/**
 *
 * @author Gabihh
 */
public class Chefe extends Funcionario {
    protected double contas;
    protected double gastosExtras;
    protected double adicionalChefia;
    
    public Chefe(){super();}
    public Chefe(String nome, 
            String rg, 
            double salarioMensal, 
            double contas, 
            double gastosExtras, 
            double adicionalChefia){
        super(nome, rg, salarioMensal);
        this.contas = contas;
        this.gastosExtras = gastosExtras;
        this.adicionalChefia = adicionalChefia;
    }
    
    public double getContas(){return this.contas;}
    public double getGastosExtras(){return this.gastosExtras;}
    public double getAdicionalChefia(){return this.adicionalChefia;}

    public void setContas(double contas){this.contas = contas;}
    public void setGastosExtras(double gastosExtras){this.gastosExtras = gastosExtras;}
    public void setAdicionalChefia(double adicionalChefia){this.adicionalChefia = adicionalChefia;}
    
    public double pagamentoExtra(){
        return pagamento() - contas - gastosExtras + adicionalChefia;
    }
}
