/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testejdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Gabihh
 */
public class TesteJDBC {

    public Connection getConnectionnection(){
        try{
            String url = "jdbc:mysql://localhost:3306/grandeporte";
            String usuario = "root";
            String senha = "root";
            Connection con = DriverManager.getConnection(url, usuario, senha);
            
            return con;
        }catch(SQLException e){
            throw new RuntimeException();
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TesteJDBC teste = new TesteJDBC();
        Connection con = teste.getConnectionnection();
        System.out.println("Conectou ao Banco de Dados!");
    }
    
}
