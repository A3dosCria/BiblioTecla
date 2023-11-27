/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Model.Livro;
import Model.Usuario;
import SQLConnect.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rayni
 */
public class DAO {
    
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
    
    public static List<Livro> lerLivroTable() throws SQLException{
        String sql = "SELECT * FROM LIVROS";
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        
        List<Livro> livros = new ArrayList<>();
        
        try{
            conn = ConnectionFactory.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()){
            
                Livro livro = new Livro();
                
                livro.setId(rs.getInt("ID"));
                livro.setTitulo(rs.getString("TITULO"));
                livro.setAutor(rs.getString("AUTOR"));
                livro.setGenero(rs.getString("TIPO"));
                livro.setNota(rs.getInt("NOTA"));
                livros.add(livro);
            }
        
        }catch(Exception e){
        e.printStackTrace();}
        finally{
            conn.close();
            pstm.close();
            rs.close();
        }
        
        return livros;
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
          
    public static void saveUsuario(Usuario usuario){
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
    
    public static void saveLivro(Livro livro){
        String sql = "INSERT INTO LIVROS (TITULO, AUTOR, TIPO, NOTA)"
                + " values (?,?,?,?)";
        
        Connection conn = null;
        PreparedStatement pstm = null;
        
        try {
        conn = ConnectionFactory.createConnectionToMySQL();
        pstm = conn.prepareCall(sql);
        pstm.setString(1, livro.getTitulo());
        pstm.setString(2, livro.getAutor());
        pstm.setString(3, livro.getGenero());
        pstm.setInt(4, livro.getNota());
        
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
    
    public static void altLivro(Livro livro, String id){
        String sql = "UPDATE LIVROS SET TITULO = ?, AUTOR = ?, TIPO = ?, NOTA = ? WHERE ID = ?";
        
        Connection conn = null;
        PreparedStatement pstm = null;
        
        try {
        conn = ConnectionFactory.createConnectionToMySQL();
        pstm = conn.prepareCall(sql);
        pstm.setString(1, livro.getTitulo());
        pstm.setString(2, livro.getAutor());
        pstm.setString(3, livro.getGenero());
        pstm.setInt(4, livro.getNota());
        pstm.setString(5, id);

        
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
    
    public static void removeLivro(String id){
        String sql = "DELETE FROM LIVROS WHERE ID = ? ";
        
        Connection conn = null;
        PreparedStatement pstm = null;
        
        try {
        conn = ConnectionFactory.createConnectionToMySQL();
        pstm = conn.prepareCall(sql);
        pstm.setString(1, id);
        
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
    
    public static Livro lerLivro(String id) throws SQLException{
        String sql = "SELECT * FROM LIVROS WHERE ID = ?";
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        Livro livro = new Livro();

        try{
            conn = ConnectionFactory.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, id);
            rs = pstm.executeQuery();
            if(rs.next()){
                livro.setId(rs.getInt("ID"));
                livro.setTitulo(rs.getString("TITULO"));
                livro.setAutor(rs.getString("AUTOR"));
                livro.setGenero(rs.getString("TIPO"));
                livro.setTipo(rs.getString("TIPO"));
                livro.setNota(rs.getInt("NOTA"));
            }      
        }catch(Exception e){
        e.printStackTrace();}
        finally{
            conn.close();
            pstm.close();
            rs.close();
        }
        
        return livro;
    }
}
