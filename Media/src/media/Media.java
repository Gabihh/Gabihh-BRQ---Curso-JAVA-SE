/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package media;

import java.util.Scanner;

/**
 *
 * @author Gabihh
 */
public class Media {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        double n1, n2, media, notaExame;
        String situacao;
        System.out.print("Entre nota 1..........: ");
        n1 = Double.parseDouble(sc.nextLine());
        System.out.print("Entre nota 2..........: ");
        n2 = Double.parseDouble(sc.nextLine());
        media = (n1 + n2)/2;
        
        if(media < 4){
            situacao = "Reprovado Direto";
        }
        else{
            if(media >= 7){
                situacao = "Aprovado direto";
            }
            else{
                System.out.print("Entre nota exame......: ");
                notaExame = Double.parseDouble(sc.nextLine());
                media = (media + notaExame)/2;
                
                if(media >= 5){
                    situacao = "Aprovado Exame";
                }
                else{
                    situacao = "Reprovado Exame";
                }
            }
        }
        
        System.out.println(media + " - " + situacao);
        
    }
    
}
