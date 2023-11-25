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
 * @author Rayni
 */
public class ConnectionFactory {
    
    private static final String username = "root";
    private static final String password = "12345";
    private static final String dbURL = "jdbc:mysql://localhost:3306/bibliotecla";


    public static Connection createConnectionToMySQL() throws SQLException, ClassNotFoundException{
        
        Class.forName("com.mysql.jdbc.Driver");
        
        Connection connection = DriverManager.getConnection(dbURL, username, password);
        
        return connection;
    }
}
