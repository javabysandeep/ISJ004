package java8Features.lambdaExpesssion;

public class Way3AnonymousClass {
    public static void main(String[] args) {
        MessageService messageService = new MessageService() {
            @Override
            public void sendMessage() {
                System.out.println("Sending message using anonymous class");
            }
        };
        messageService.sendMessage();
    }
}
