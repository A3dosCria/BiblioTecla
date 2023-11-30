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

    public static boolean Autenticate(String username, String password) throws ClassNotFoundException {
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
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static List<Livro> lerLivroTable() throws SQLException {
        String sql = "SELECT LIVROS.id AS ID, LIVROS.titulo AS TITULO, AUTOR, TIPO, ROUND(AVG(NOTAS.nota)) AS NOTA\n"
                + "FROM LIVROS\n"
                + "JOIN NOTAS ON LIVROS.id = NOTAS.livroid\n"
                + "GROUP BY LIVROS.id, LIVROS.titulo;";
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;

        List<Livro> livros = new ArrayList<>();

        try {
            conn = ConnectionFactory.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {

                Livro livro = new Livro();

                livro.setId(rs.getInt("ID"));
                livro.setTitulo(rs.getString("TITULO"));
                livro.setAutor(rs.getString("AUTOR"));
                livro.setTipo(rs.getString("TIPO"));
                livro.setNota(rs.getInt("NOTA"));
                livros.add(livro);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conn.close();
            pstm.close();
            rs.close();
        }

        return livros;
    }

    public static String tipoUsu(String username, String password) throws ClassNotFoundException {
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
                if (resultSet.next()) {
                    tipoUsu = resultSet.getString("TIPOUSU");
                    return tipoUsu;
                } else {
                    return null;
                }
            }
        } catch (SQLException e) {

            e.printStackTrace();
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static void saveUsuario(Usuario usuario) {
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
            pstm.setInt(5, usuario.getIdade());
            pstm.setString(6, usuario.getSexo());
            pstm.setString(7, usuario.getLivroPref1());
            pstm.setString(8, usuario.getLivroPref2());

            pstm.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void saveLivro(Livro livro) {
        String sqlInsertLivro = "INSERT INTO LIVROS (TITULO, AUTOR, TIPO) VALUES (?, ?, ?)";
        String sqlInsertNota = "INSERT INTO NOTAS (nota , livroid) VALUES ( ?, LAST_INSERT_ID())";

        Connection conn = null;
        PreparedStatement pstmInsertLivro = null;
        PreparedStatement pstmInsertNota = null;

        try {
            conn = ConnectionFactory.createConnectionToMySQL();

            pstmInsertLivro = conn.prepareStatement(sqlInsertLivro);
            pstmInsertLivro.setString(1, livro.getTitulo());
            pstmInsertLivro.setString(2, livro.getAutor());
            pstmInsertLivro.setString(3, livro.getTipo());

            pstmInsertLivro.executeUpdate();

            pstmInsertNota = conn.prepareStatement(sqlInsertNota);
            pstmInsertNota.setDouble(1, livro.getNota());

            // Executa a inserção
            pstmInsertNota.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstmInsertLivro != null) {
                    pstmInsertLivro.close();
                }
                if (pstmInsertNota != null) {
                    pstmInsertNota.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void altLivro(Livro livro, String id) {
        String sqlUpdateLivro = "UPDATE LIVROS SET TITULO = ?, AUTOR = ?, TIPO = ? WHERE ID = ?";
        String sqlInsertNota = "INSERT INTO NOTAS (nota, livroid) VALUES (?, ?)";

        Connection conn = null;
        PreparedStatement pstUpdateLivro = null;
        PreparedStatement pstInsertNota = null;

        try {
            conn = ConnectionFactory.createConnectionToMySQL();

            // Atualização na tabela LIVROS
            pstUpdateLivro = conn.prepareStatement(sqlUpdateLivro);
            pstUpdateLivro.setString(1, livro.getTitulo());
            pstUpdateLivro.setString(2, livro.getAutor());
            pstUpdateLivro.setString(3, livro.getTipo());
            pstUpdateLivro.setString(5, id);

            // Executa a atualização
            pstUpdateLivro.executeUpdate();

            // Inserção na tabela NOTAS
            pstInsertNota = conn.prepareStatement(sqlInsertNota);
            pstInsertNota.setInt(1, Integer.parseInt(id));
            pstInsertNota.setDouble(2, livro.getNota());  // Substitua pela sua lógica de cálculo da nota

            // Executa a inserção
            pstInsertNota.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstUpdateLivro != null) {
                    pstUpdateLivro.close();
                }
                if (pstInsertNota != null) {
                    pstInsertNota.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void removeLivro(String id) {
        String sql = "DELETE FROM LIVROS WHERE ID = ? ";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = ConnectionFactory.createConnectionToMySQL();
            pstm = conn.prepareCall(sql);
            pstm.setString(1, id);

            pstm.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static Livro lerLivro(String id) throws SQLException {
        String sql = "SELECT LIVROS.id AS ID, LIVROS.titulo AS TITULO, AUTOR, TIPO, ROUND(AVG(NOTAS.nota)) AS NOTA\n"
                + "FROM LIVROS\n"
                + "JOIN NOTAS ON LIVROS.id = NOTAS.livroid\n"
                + "WHERE LIVROS.ID = ?\n"
                + "GROUP BY LIVROS.id, LIVROS.titulo";
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        Livro livro = new Livro();

        try {
            conn = ConnectionFactory.createConnectionToMySQL();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, id);
            rs = pstm.executeQuery();
            if (rs.next()) {
                livro.setId(rs.getInt("ID"));
                livro.setTitulo(rs.getString("TITULO"));
                livro.setAutor(rs.getString("AUTOR"));
                livro.setTipo(rs.getString("TIPO"));
                livro.setNota(rs.getInt("NOTA"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conn.close();
            pstm.close();
            rs.close();
        }

        return livro;
    }

    public static void insertNota(String id, int nota) {

        String sql = "insert into notas (Nota, LivroID) values (?, ?)";
        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = ConnectionFactory.createConnectionToMySQL();
            pstm = conn.prepareCall(sql);
            pstm.setInt(1, nota);
            pstm.setString(2, id);

            pstm.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
