/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixa;

/**
 *
 * @author Gabihh
 */
public class Caixa<T> {
    private T dado;
    public void setDado(T dado) {
        this.dado = dado;
    }
    public T get() {
        return dado;
    }
    public static void main(String[] args) {
        Caixa<Integer> caixaInteger = new Caixa<Integer>();
        Caixa<String> caixaString = new Caixa<String>();

        caixaInteger.setDado (10);
        caixaString.setDado (new String("Olá Mundo!"));
        System.out.println("Valor Inteiro : " + caixaInteger.get());
        System.out.println("Valor String : " + caixaString.get());
    }
}
