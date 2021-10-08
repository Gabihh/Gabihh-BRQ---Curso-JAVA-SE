/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudostring;

/**
 *
 * @author Gabihh
 */
public class EstudoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nome1 = "Annanias";
        String nome2 = "Costa";
        String nome3 = "annanias";
        String sobrenome = "Silva";
        String nomeCompleto = nome1 + " da " + sobrenome;
        System.out.println("Nome = " + nomeCompleto);
        System.out.println("Nome = " + nomeCompleto.length());
        System.out.println("Nome = " + nomeCompleto.toLowerCase());
        System.out.println("Nome = " + nomeCompleto.toUpperCase());
        System.out.println("Nome = " + nomeCompleto.trim());
        System.out.println("Nome = " + nomeCompleto.trim().length());
        System.out.println("Nome = " + nomeCompleto.charAt(8));
        System.out.println("Nome = " + nomeCompleto.substring(5, 10));
        System.out.println(nome1.equals(nome2));
        System.out.println(nome1.equals(nome3));
        System.out.println(nome1.equalsIgnoreCase(nome3));
        System.out.println(nome1.compareTo(nome2));
        System.out.println(nome1.compareTo(nome3));
        System.out.println(nome1.compareToIgnoreCase(nome3));
    }
    
}
