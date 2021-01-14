/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;
    
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Sqlconnection{
 public Sqlconnection(){
     
 }

    /**
     *
     */
    public void connection(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
            String url = "jdbc:sqlserver://localhost:1433;user=sa;password=lu1234;";
        
            Connection con = DriverManager.getConnection(url);  
            }
    catch(SQLException e){
        System.err.println("ERRO de conexão: "+e.getMessage());
        
            }
        catch(ClassNotFoundException e){
            System.err.println("Erros gerais: "+e.getMessage());
        
            }
    }

}