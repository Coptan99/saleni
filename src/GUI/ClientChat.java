package GUI;

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
import javax.swing.JTextField;

public class ClientChat {
    public ClientChat() {
        // Initialize the JFrame
        JFrame frame = new JFrame();
        frame.getContentPane().setBackground(new Color(0, 0, 139));
        frame.setBackground(Color.blue);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setSize(550, 650);
        frame.setTitle("Chat with Saleni Chatbot"); 
        frame.setVisible(true);
        Font font = new Font("verdana", Font.BOLD, 15);

        JTextArea textArea = new JTextArea();
        textArea.setBounds(20, 20, 340, 200);
        frame.add(textArea);

        JTextField textField = new JTextField();
        textField.setBounds(20, 230, 200, 30);
        frame.add(textField);

        JButton sendButton = new JButton("Send");
        sendButton.setBounds(230, 230, 130, 30);
        frame.add(sendButton);
    }  
}
