package controlStatements.conditional.ifElseDemos;

public class LaptopBuying {
    public static void main(String[] args) {
        int amount = 60000;
        String processor = "I5";
        int ram = 8;
        int processorGeneration = 12;
        int ssd = 512;

        if (amount <= 60000 && processorGeneration >= 10 && ssd >= 512 && ram >= 8) {
            System.out.println("Go ahead and buy");
        } else {
            System.out.println("don't buy");
        }
    }
}
