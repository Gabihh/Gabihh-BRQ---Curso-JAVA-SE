/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herancapag182;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Gabihh
 */
public class HerancaPag182 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date dataf = formato.parse("10/09/2021");
        Date datav = formato.parse("10/10/2021");
        
        Livro P01 = new Livro("01", "Romance", 100.0 , 150.0, "Teste");
        System.out.println(P01.getISBN());
        
        Alimenticio A01 = new Alimenticio("01", "Romance", 100.0 , 150.0, dataf, datav, 100);
        System.out.println(A01.getDataValidade());
    }
    
}
