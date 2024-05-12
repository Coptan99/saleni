package GUI;
import GUI.LoginPage;
import GUI.ClientChat;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class HomePage {
    public HomePage() {
        // Initialize the JFrame
        JFrame frame = new JFrame();
        frame.getContentPane().setBackground(new Color(0, 0, 139));
        frame.setBackground(Color.blue);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setSize(550, 650);
        frame.setTitle("Saleni Chatbot");
        frame.setVisible(true);
        Font font = new Font("verdana", Font.BOLD, 15);

        // Create ActionListener object for login button
        ActionListener loginAction = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LoginPage loginPage = new LoginPage();
                loginPage.setVisible(true);
            }
        };

        // User acc button
        JButton but1 = new JButton(" ");
        but1.setBounds(1440, 10, 75, 20);
        but1.setBackground(Color.BLACK);
        but1.setForeground(Color.ORANGE);
        frame.add(but1);

        // Settings button
        JButton but2 = new JButton(" ");
        but2.setBounds(1440, 35, 75, 20);
        but2.setBackground(Color.BLACK);
        but2.setForeground(Color.ORANGE);
        frame.add(but2);

        // Add the logo to the JFrame
        ImageIcon logo = new ImageIcon ("Assests/logo.png");
        JLabel imageLabel = new JLabel(logo);
        imageLabel.setBounds(460, 200, 500, 300);
        frame.add(imageLabel);

        // Sign in button
        JButton login = new JButton("Sign in/Sign up");
        login.setBounds(650, 530, 210, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.ORANGE);
        login.setFont(font);
        frame.add(login);
        login.addActionListener(loginAction);

        // Start button
        JButton start = new JButton("Let's start chatting");
        start.setBounds(650, 570, 210, 50);
        start.setBackground(Color.BLACK);
        start.setForeground(Color.ORANGE);
        start.setFont(font);
        frame.add(start);
    }
}
