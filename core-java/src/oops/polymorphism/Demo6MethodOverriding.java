package oops.polymorphism;

public class Demo6MethodOverriding {
    public static void main(String[] args) {
        class MessageService {
            private void sendMessage(String message) {
                System.out.println("sending message using email :" + message);
            }
        }

        class MessageServiceImpl extends MessageService {
            //@Override
            public void sendMessage(String message) {
                System.out.println("Sending message using whatsApp: " + message);
            }
        }

        MessageService messageService = new MessageServiceImpl();
        messageService.sendMessage("Hi");
    }
}
