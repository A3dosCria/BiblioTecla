/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Rayni
 */
public class Usuario {
    
    private String tipo;
    private String login;
    private String senha;
    private String nome;
    private int idade;
    private String sexo;
    private String livroPref1;
    private String livroPref2;
    
    public Usuario(String tipo, String login, String senha, String nome, int idade, String sexo, String livropref1, String livroPref2){
        tipo = this.tipo;
        login = this.login;
        senha = this.senha;
        nome = this.nome;
        idade = this.idade;
        sexo = this.sexo;
        livropref1 = this.livroPref1;
        livroPref2 = this.livroPref2;
    }
    
    public Usuario() {
         
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getLivroPref1() {
        return livroPref1;
    }

    public void setLivroPref1(String livroPref1) {
        this.livroPref1 = livroPref1;
    }

    public String getLivroPref2() {
        return livroPref2;
    }

    public void setLivroPref2(String livroPref2) {
        this.livroPref2 = livroPref2;
    }
    
 
}
