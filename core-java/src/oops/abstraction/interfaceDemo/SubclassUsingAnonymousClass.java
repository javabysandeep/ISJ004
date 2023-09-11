package oops.abstraction.interfaceDemo;

public class SubclassUsingAnonymousClass {
    public static void main(String[] args) {
      MessageService messageService =   new MessageService() {
            @Override
            public void sendMessage() {
                System.out.println("Sending message.. using anonymous class");
            }
        };
      messageService.sendMessage();


    }
}
