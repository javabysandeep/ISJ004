package oops.abstraction.abstractClass;

public class MessageServiceImpl extends MessageService {
    @Override
    void sendMessage(String message) {
        System.out.println("Sending message "+message);
    }

    public static void main(String[] args) {
        MessageService messageService = new MessageServiceImpl();
        messageService.sendMessage("Hi");
    }
}
