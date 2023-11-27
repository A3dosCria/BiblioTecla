/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Model.Usuario;
import SQLConnect.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Rayni
 */
public class UsuarioDAO {
    
    public static boolean Autenticate(String username, String password) throws ClassNotFoundException{
        String sql = "SELECT * FROM usuarios WHERE LOGIN = ? AND SENHA = ?";
        Connection conn = null;
        PreparedStatement pstm = null;
        
        try {
        conn = ConnectionFactory.createConnectionToMySQL();
        pstm = conn.prepareStatement(sql);
        pstm.setString(1, username);
        pstm.setString(2, password);
            try (ResultSet resultSet = pstm.executeQuery()) {
                return resultSet.next();
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        finally{
            try{
                if(pstm!=null){
                    pstm.close();
                }
                if(conn!=null){
                conn.close();}
            }
            catch(Exception e){
            e.printStackTrace();
            }
        }
    }
    
    public static String tipoUsu(String username, String password) throws ClassNotFoundException{
        String tipoUsu;
        String sql = "SELECT TIPOUSU FROM usuarios WHERE LOGIN = ? AND SENHA = ?";
        Connection conn = null;
        PreparedStatement pstm = null;
        
        try {
        conn = ConnectionFactory.createConnectionToMySQL();
        pstm = conn.prepareStatement(sql);
        pstm.setString(1, username);
        pstm.setString(2, password);
            try (ResultSet resultSet = pstm.executeQuery()) {
                if(resultSet.next()){
                    tipoUsu = resultSet.getString("TIPOUSU");
                    return tipoUsu;
                }
                else{
                return null;}
            }
        }
        catch (SQLException e) {
            
            e.printStackTrace();
        }
        finally{
            try{
                if(pstm!=null){
                    pstm.close();
                }
                if(conn!=null){
                conn.close();}
            }
            catch(Exception e){
            e.printStackTrace();
            }
        }
        return null;
    }
       

    
    public void save(Usuario usuario){
        String sql = "insert into usuarios (tipousu, login, senha, nome, idade, sexo, tplivropref1, tplivropref2)"
                + " values (?,?,?,?,?,?,?,?)";
        
        Connection conn = null;
        PreparedStatement pstm = null;
        
        try {
        conn = ConnectionFactory.createConnectionToMySQL();
        pstm = conn.prepareCall(sql);
        pstm.setString(1, usuario.getTipo());
        pstm.setString(2, usuario.getLogin());
        pstm.setString(3, usuario.getSenha());
        pstm.setString(4, usuario.getNome());
        pstm.setInt(4, usuario.getIdade());
        pstm.setString(6, usuario.getSexo());
        pstm.setString(7, usuario.getLivroPref2());
        pstm.setString(8, usuario.getLivroPref2());
        
        pstm.execute();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally{
            try{
                if(pstm!=null){
                    pstm.close();
                }
                if(conn!=null){
                conn.close();}
            }
            catch(Exception e){
            e.printStackTrace();
            }
    }
    }
    
}
