package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import org.alicebot.api.Bot;
import org.alicebot.api.MagicString;
import org.alicebot.api.users.User;

public class ClientChat {

    private JTextArea textArea;
    private JTextField textField;
    private Bot bot;

    public ClientChat() {
        initialize();
        // Initialize Alicebot
        try {
            String resourcesPath = "resources"; // Replace with your resources folder path
            bot = org.alicebot.api.BotFactory.createAIMLBot(resourcesPath);
            bot.writeLearnFile(); // Train the bot (optional)
        } catch (Exception e) {
            e.printStackTrace();
            // Handle initialization errors (e.g., display error message)
        }
    }

    private void initialize() {
        JFrame frame = new JFrame();
        frame.getContentPane().setBackground(new Color(0, 0, 139));
        frame.setBackground(Color.BLUE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setSize(550, 650);
        frame.setTitle("Chat with Saleni Chatbot");
        frame.setVisible(true);

        Font font = new Font("verdana", Font.BOLD, 15);

        textArea = new JTextArea();
        textArea.setBounds(20, 20, 340, 200);
        textArea.setFont(font);
        frame.add(textArea);

        textField = new JTextField();
        textField.setBounds(20, 230, 200, 30);
        frame.add(textField);

        JButton sendButton = new JButton("Send");
        sendButton.setBounds(230, 230, 130, 30);
        frame.add(sendButton);

        sendButton.addActionListener(new ActionListener() {
            @Override
            public actionPerformed(ActionEvent e) {
                String userText = textField.getText();
                if (!userText.isEmpty()) {
                    textArea.append("Client: " + userText + "\n");
                    String botResponse = bot.getResponse(new User("user"), new MagicString(userText));
                    textArea.append("Saleni: " + botResponse + "\n");
                    textField.setText("");
                }
            }
        });
    }
}
