package collectionFramework.queueImplementations;


import java.util.LinkedList;
import java.util.Queue;

public class Demo3LinkedList {
    public static void main(String[] args) {
        Queue<Employee> employees = new LinkedList<>();

        Employee employee1 = new Employee(11, "Salman", 100000);
        Employee employee2 = new Employee(1, "Javed", 2567);
        Employee employee3 = new Employee(33, "Vaibhav", 6789);
        Employee employee4 = new Employee(67, "Ritik", 7432);
        Employee employee5 = new Employee(19, "Sandeep", 345567888);

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);

        System.out.println(employees.poll());
        System.out.println(employees.poll());
        System.out.println(employees.poll());
        System.out.println(employees.poll());
        System.out.println(employees.poll());
        System.out.println(employees.poll());
    }
}
