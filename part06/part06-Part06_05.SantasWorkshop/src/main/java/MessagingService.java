
import java.util.ArrayList;

public class MessagingService {
    
    private ArrayList<Message> messages;
    
    public MessagingService() {
        this.messages = new ArrayList<>();
    }
    
    public void add(Message message) {
        String[] pieces = message.getContent().split("");
        if (pieces.length <= 280) {
            this.messages.add(message);
        }
    }
    
    public ArrayList<Message> getMessages() {
        return this.messages;
    }
}
