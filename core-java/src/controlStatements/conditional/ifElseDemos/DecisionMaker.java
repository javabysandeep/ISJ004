package controlStatements.conditional.ifElseDemos;

public class DecisionMaker {
    public static void main(String[] args) {
        int budget = 10000;
        boolean parentPermission = true;
        if (budget >= 10000 && parentPermission) {
            System.out.println("Go goa");
        } else {
            System.out.println("Stay home stay safe");
        }
    }
}
