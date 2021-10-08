/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p4e04;

/**
 *
 * @author Gabihh
 */
public class Metodos {
    public void metodoA(){
        System.out.println("Método A iniciado!");
        metodoB();
        System.out.println("Método A finalizado!");
    }
    public void metodoB(){
        System.out.println("Método B iniciado!");
        metodoC();
        System.out.println("Método B finalizado!");
    }
    public void metodoC(){
        System.out.println("Método C iniciado!");
        metodoD();
        System.out.println("Método C finalizado!");
    }
    public void metodoD(){
        System.out.println("Método D iniciado!");
        try{
            double teste = 10/0;
        }
        catch(Exception e){
            System.out.println("Erro identificado: " + e);
        }  
        System.out.println("Método D finalizado!");
    }
}
