package oops.abstraction.abstractClass;

public class SubclassUsingAnonymousClass {
    public static void main(String[] args) {
        MessageService messageService = new MessageService() {
            @Override
            void sendMessage(String message) {
                System.out.println("Sending message " + message);
            }
        };
        messageService.sendMessage("Good morning");
    }
}
