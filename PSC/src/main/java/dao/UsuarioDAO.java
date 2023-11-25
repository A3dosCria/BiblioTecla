/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Model.Usuario;
import SQLConnect.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Rayni
 */
public class UsuarioDAO {
    
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
