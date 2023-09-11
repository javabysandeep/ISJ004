package java8Features.lambdaExpesssion;

public class Way1TraditionalWay {
    public static void main(String[] args) {
        MessageService messageService = new MessageServiceImpl();
        messageService.sendMessage();
    }
}
class MessageServiceImpl implements MessageService{
    @Override
    public void sendMessage() {
        System.out.println("Traditional way");
    }
}
