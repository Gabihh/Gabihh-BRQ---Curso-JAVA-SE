/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploherancapag179;

/**
 *
 * @author Gabihh
 */
public class Estagiario extends Funcionario{
    // construtor evocando super
    public Estagiario(int idFunc, String nomeFunc, double salarioHora){
        super(idFunc,nomeFunc,salarioHora);
    }
    
    // cálculo do salário líquido para estagiários
    @Override
    public double calculaSalario(double horasTrabalhadas){
        double salBruto = salarioHora * horasTrabalhadas;
        double salLiquido;
        
        if (salBruto <= 1000.00)
        salLiquido = 1000.00;
        
        else
        salLiquido = salBruto;
        
        return salLiquido;
    }
    
    // cálculo da bonificação para os estagiários
    @Override
    public double bonificacao(){
        return super.bonificacao() + 200.0;
    }
}
