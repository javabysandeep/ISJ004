package collectionFramework.queueImplementations;


import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Demo4PriorityQueue {
    public static void main(String[] args) {
        // Comparator<Employee> comparator = (emp1, emp2) -> emp2.getEmployeeSalary() - emp1.getEmployeeSalary();
        Comparator<Employee> comparator = (emp1, emp2) -> emp1.getEmployeeId() - emp2.getEmployeeId();

        Queue<Employee> employees = new PriorityQueue<>(comparator);

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
