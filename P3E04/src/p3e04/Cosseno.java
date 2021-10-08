/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3e04;

/**
 *
 * @author Gabihh
 */
public class Cosseno {
    private double x;
    private double [] parcelas;
    private double cosseno;
	
    public Cosseno(double x) {
        this.x = x;
	parcelas = new double[10];
    }
	
    public double getX() {
        return x;
    }
	
    public void setX(double x) {
        this.x = x;

    }
	
    public double[] getParcelas() {
        return parcelas;

    }
	
    public double getCosseno() {
        return cosseno;

    }
	
    public void calculaParcelas() {
        double sinal = 1.0;

        for(int i=0; i<parcelas.length;i++) {
            parcelas[i]= sinal * 1/fatorial(i*2)*Math.pow(x, i*2);
            sinal = sinal * (-1.0);
	}
    }
	
    public long fatorial(long n) {
        if(n<2) return 1;
	return n * fatorial(n-1);
    }
	
    public void somaParcelas() {
        double soma = 0.0;

        for(double bandeja:parcelas)
            soma+= bandeja;
        cosseno = soma;

    }
}
