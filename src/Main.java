// import GUI.HomePage;
//
// public class Main {
//     public static void main(String[] args) {
//         // HomePage homepage = new HomePage();
//     }
// }
//
import org.alicebot.ab.*;
public class Main {
    public static void main(String[] args) {
        String botName = "alice";
        Bot bot = new Bot(botName, "src/main/resources");
        Chat chat = new Chat(bot);
        String user = "Hello";
        String response = chat.multisentenceRespond(user);
        System.out.println("User: " + user);
        System.out.println("Chatbot: " + response);
    }
}
