/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SQLConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author RENNAN
 */
public class ConnectMSQL {
    public static Connection ConnectMSQL() throws SQLException {
        
        Connection connectSQL = null;
        
        try {   
            Class.forName("com.mysql.jdbc.Driver");
            connectSQL = DriverManager.getConnection("jdbc:mysql://localhost/banco", "user", "password");
        }
        catch (ClassNotFoundException ex) {
            System.out.println("Driver do banco de dados não localizado!");
        }
        catch (SQLException ex) {
            System.out.println("Ocorreu um erro ao acessar o banco de dados: "+ex.getMessage());
        }
        finally {
            if(connectSQL != null){
                connectSQL.close();
            }
        }
        return null;
    }
}