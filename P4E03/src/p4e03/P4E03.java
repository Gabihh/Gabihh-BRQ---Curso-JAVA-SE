/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p4e03;

import java.util.Scanner;

/**
 *
 * @author Gabihh
 */
public class P4E03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        try{
            Scanner sc = new Scanner(System.in);
            int velocidade, acelerar, desacelerar;
            String resposta;

            System.out.print("Digite a velocidade do carro: ");
            velocidade = Integer.parseInt(sc.nextLine());
            Veiculo v = new Veiculo(velocidade);

            System.out.print("Digite se deseja ACELERAR ou DESACELERAR: ");
            resposta = sc.nextLine();

            switch(resposta){
                case "ACELERAR" : 
                    System.out.print("Digite quanto deseja acelerar: ");
                    acelerar = Integer.parseInt(sc.nextLine());
                    v.acelera(acelerar);
                    System.out.println("Velocidade atualizada: " + v.getVelocidade() + " Km/h");
                    break;
                case "DESACELERAR": 
                    System.out.print("Digite quanto deseja desacelerar: ");
                    desacelerar = Integer.parseInt(sc.nextLine());
                    v.desacelara(desacelerar);
                    System.out.println("Velocidade atualizada: " + v.getVelocidade() + " Km/h");
                    break;
                default: 
                    System.out.println("Resposta não se enquadra nas opções!");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
