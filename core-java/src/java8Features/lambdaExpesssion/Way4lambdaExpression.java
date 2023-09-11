package java8Features.lambdaExpesssion;

public class Way4lambdaExpression {
    public static void main(String[] args) {
        MessageService messageService = () -> System.out.println("Sending message using lambda expression ");
        messageService.sendMessage();
    }
}
