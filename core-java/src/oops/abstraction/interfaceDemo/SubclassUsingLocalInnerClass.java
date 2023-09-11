package oops.abstraction.interfaceDemo;

public class SubclassUsingLocalInnerClass {
    public static void main(String[] args) {
        class MessageServiceImpl implements MessageService{
            @Override
            public void sendMessage() {
                System.out.println("Subclass created using local inner class");
            }
        }

        MessageService messageService = new MessageServiceImpl();
        messageService.sendMessage();
    }
}
