/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testepreparedstatement;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabihh
 */
public class TestePreparedStatement {
    
    public Connection getConnection(){
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
    public static void main(String[] args) throws SQLException{
        // TODO code application logic here
        TestePreparedStatement teste = new TestePreparedStatement();
        Connection con = teste.getConnection();
        System.out.println("Conectou ao Banco de Dados!");

        try {
            //Leitura dos parâmetros passados pelo usuário
            String nome = JOptionPane.showInputDialog("Entre com o nome do aluno para gravar no Banco de Dados: ");
            String idade = JOptionPane.showInputDialog("Entre com o idade do aluno para gravar no Banco de Dados: ");
            String curso = JOptionPane.showInputDialog("Entre com o cód. do curso para gravar no Banco de Dados: ");

            String insert = "INSERT INTO aluno (nome, idade, curso) VALUES (?, ?, ?)";
            
            PreparedStatement preparedStatement = con.prepareStatement(insert);
            preparedStatement.setString(1, nome);
            preparedStatement.setInt(2, Integer.parseInt(idade));
            preparedStatement.setInt(3, Integer.parseInt(curso));
            preparedStatement.executeUpdate();
            System.out.println("Inserido novo aluno com sucesso!");

            Statement statement = con.createStatement();
            String sql = "SELECT * FROM aluno";
            ResultSet resultado = statement.executeQuery(sql);
            
            while (resultado.next()){
                System.out.println("ID: " + resultado.getString("idaluno") 
                            + ", Nome: "  + resultado.getString("nome")    
                            + ", Curso: " + resultado.getString("curso"));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }  
}
