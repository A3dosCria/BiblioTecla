/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.usjt.a32023;

import static SQLConnect.ConnectionFactory.createConnectionToMySQL;
import View.TelaLogin;
import java.sql.Connection;
import java.sql.SQLException;
/**
 *
 * @author RENNAN
 */
public class A32023 {

    public static void main(String[] args) throws Exception
    {
        Connection con = createConnectionToMySQL();
        if(con != null){
            System.out.println("conexão obtida com sucesso");
            con.close();
        }
        
        TelaLogin login = new TelaLogin();
        login.setVisible(true);
    }
}
