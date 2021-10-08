/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p4e03;

/**
 *
 * @author Gabihh
 */
public class Veiculo {
    private int velocidade = 0;
    private int velocidadeMax = 100;
    
    public Veiculo(){}
    public Veiculo(int velocidade){this.velocidade = velocidade;}
    
    public int getVelocidade(){return this.velocidade;}
    public int getVelocidadeMax(){return this.velocidadeMax;}
    
    public void setVelocidade(int velocidade){this.velocidade = velocidade;}
    public void setVelocidadeMax(int velocidadeMax){this.velocidadeMax = velocidadeMax;}
    
    public void acelera(int incremento) throws VelocidadeAlta{
        if(velocidade + incremento > velocidadeMax){
        // lançar exceção ...
            throw new VelocidadeAlta("A velocidade está acima do limite máximo!!");
        }
        else
        {
            velocidade += incremento;
        }
    }
    
    public void desacelara(int decremento) throws VelocidadeBaixa{
        if(velocidade - decremento < 0){
        // lançar exceção ...
            throw new VelocidadeBaixa("A velocidade está abaixo de zero!!");
        }
        else
        {
            velocidade -= decremento;
        }
    }
}
