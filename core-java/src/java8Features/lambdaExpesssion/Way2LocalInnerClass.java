package java8Features.lambdaExpesssion;

public class Way2LocalInnerClass {
    public static void main(String[] args) {
        class MessageServiceImpl implements MessageService{
            @Override
            public void sendMessage() {
                System.out.println("Sending message using local innner class");
            }
        }
        MessageService messageService = new MessageServiceImpl();
        messageService.sendMessage();
    }
}
