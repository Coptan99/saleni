package GUI;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPage {
    public LoginPage() {
        // Initialize the JFrame
        JFrame frame = new JFrame();
        frame.getContentPane().setBackground(new Color(0, 0, 139));
        frame.setBackground(Color.BLUE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setSize(550, 650);
        frame.setTitle("Login");
        frame.setVisible(true);
        Font font = new Font("verdana", Font.BOLD, 20);

        // Logo 
        ImageIcon logo = new ImageIcon("Assests/logo.png");
        JLabel imageLabel = new JLabel(logo);
        imageLabel.setBounds(0, 0, 400, 300);
        frame.add(imageLabel);

        // Username and password fields
        JLabel usernameLabel = new JLabel("Username: ");
        usernameLabel.setBounds(535, 490, 210, 30);
        usernameLabel.setForeground(Color.WHITE);
        usernameLabel.setFont(font);
        frame.add(usernameLabel);

        JTextField usernameField = new JTextField(20);
        usernameField.setBounds(660, 490, 210, 30);
        usernameField.setFont(font);
        usernameField.setBackground(Color.BLACK);
        usernameField.setForeground(Color.GRAY);
        usernameField.setCaretColor(Color.WHITE);
        frame.add(usernameField);

        JLabel passwordLabel = new JLabel("Password: ");
        passwordLabel.setBounds(540, 530, 210, 30);
        passwordLabel.setForeground(Color.WHITE);
        passwordLabel.setFont(font);
        frame.add(passwordLabel);

        JPasswordField passwordField = new JPasswordField(20);
        passwordField.setBounds(660, 530, 210, 30);
        passwordField.setFont(font);
        passwordField.setBackground(Color.BLACK);
        passwordField.setForeground(Color.GRAY);
        frame.add(passwordField);

        // Forgot password and login buttons
        JButton forgotPasswordButton = new JButton("Forgot Password?");
        forgotPasswordButton.setBounds(740, 570, 150, 25);
        forgotPasswordButton.setBackground(new Color(0, 0, 139));
        forgotPasswordButton.setBorderPainted(false);
        forgotPasswordButton.setForeground(Color.GRAY);
        frame.add(forgotPasswordButton);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(683, 610, 150, 30);
        loginButton.setBackground(Color.BLACK);
        loginButton.setForeground(Color.ORANGE);
        loginButton.setFont(font);
        frame.add(loginButton);

        JButton registerButton = new JButton("No account? Register here!");
        registerButton.setBackground(new Color(0, 0, 139));
        registerButton.setBounds(660, 645, 200, 20);
        registerButton.setBackground(Color.BLACK);
        registerButton.setForeground(Color.ORANGE);
        frame.add(registerButton);
    }
}

