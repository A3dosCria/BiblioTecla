/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
        
public class LogForm extends JFrame{
    
    private JLabel titleL;
    private JLabel usernameL;
    private JLabel passwordL;
    private JTextField usernameF;
    private JPasswordField passwordF;
    private JButton loginButton;
    
    public LogForm() {
        setTitle("Login Form");
        setSize(300,150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);//centraliza a janela na tela 
    
        JPanel panel=new JPanel(new GridLayout(3,2));
        
        titleL=new JLabel("Welcome!");
        usernameL=new JLabel("User: ");
        passwordL=new JLabel("Password: ");
        usernameF=new JTextField();
        passwordF=new JPasswordField();
        loginButton=new JButton("Sign Up");
        
        panel.add(titleL);
        panel.add(new JLabel(""));
        panel.add(usernameL);
        panel.add(usernameF);
        panel.add(passwordL);
        panel.add(passwordF);
        
        add(panel, BorderLayout.CENTER);
        add(loginButton, BorderLayout.SOUTH);
        
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //logica de autenticação add aqui
                //verificação das credenciais usernameF e passwordF
            }            
        });   
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run(){
            LogForm loginForm=new LogForm();
            loginForm.setVisible(true);
            }
        });
    }
}