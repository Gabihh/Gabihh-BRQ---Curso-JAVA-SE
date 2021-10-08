/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p4e01;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Gabihh
 */
public class P4E01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date dtNasc = formato.parse("29/07/2002");
        Date dtAdms = formato.parse("29/07/2021");
        
        DecimalFormat fd = new DecimalFormat("#.##");
        double salario = 1100;
        

        Scanner sc = new Scanner(System.in);
        int qtd;
        
        System.out.print("Digite a quantidade de cópias que deseja: ");
        qtd = Integer.parseInt(sc.nextLine());
        
        Aluno a = new Aluno("Gabriela", "45589937817", dtNasc, "01");
        Professor p = new Professor("Gabriela", "45589937817", dtNasc, salario, "Matemática");
        Funcionario f = new Funcionario("Gabriela", "45589937817", dtNasc, salario, dtAdms, "Faxineiro");
        
        System.out.println("O aluno pagou R$" + fd.format(a.tirarCopia(qtd)) + " por " + qtd + " cópias");
        
        System.out.println("O professor pagou R$" + fd.format(p.tirarCopia(qtd)) + " por " + qtd + " cópias");
        System.out.println("O funcionário pagou R$" + fd.format(f.tirarCopia(qtd)) + " por " + qtd + " cópias");
    }
    
}
