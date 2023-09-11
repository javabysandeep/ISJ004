package oops.abstraction.interfaceDemo;

public class MessageServiceImpl implements MessageService {
    @Override
    public void sendMessage() {
        System.out.println("Sending message..");
    }

    public static void main(String[] args) {
        MessageService messageService = new MessageServiceImpl();
        messageService.sendMessage();
    }
}
