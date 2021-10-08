/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplodata;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Gabihh
 */
public class ExemploData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // instanciando um objeto Date
        Date minhaData = new Date();
        // exibindo data e hora usando toString()
        System.out.println(minhaData.toString());
        
        Date agora = new Date( );
        SimpleDateFormat ft = new SimpleDateFormat ("E dd.MM.yyyy 'às' hh:mm:ss a zzz");
        System.out.println("Data Atual: " + ft.format(agora));
        
        // definindo a string de formatação
        SimpleDateFormat sf = new SimpleDateFormat ("dd.MM.yyyy");
        // String com a data para conversão
        String minhaStringData = "22.02.2015";
        System.out.print(minhaStringData + " Convertido para ");
        // definindo um objeto do tipo date
        Date md;
        try {
            md = sf.parse(minhaStringData);
            System.out.println(md);
        }
        catch (ParseException e) {
            System.out.println("Erro de converção usando " + sf);
        }
    }
    
}
