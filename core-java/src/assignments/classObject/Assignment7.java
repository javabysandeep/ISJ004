package assignments.classObject;

import java.util.Scanner;

public class Assignment7 {
    //Print the average of three numbers entered by user
    // by creating a class named 'Average' having a method to calculate and print the average
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers");
        Average average = new Average();
        average.number1 = scanner.nextInt();
        average.number2 = scanner.nextInt();
        average.number3 = scanner.nextInt();
        System.out.println("Average of three numbers "+average.calculateAverage());
    }
}

class Average {
    int number1;
    int number2;
    int number3;

    double calculateAverage() {
        return (number1 + number2 + number3) / 3;
    }
}
