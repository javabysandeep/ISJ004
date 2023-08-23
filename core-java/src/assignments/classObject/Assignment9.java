package assignments.classObject;

public class Assignment9 {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.employeeName = "Robert";
        employee1.yearOfJoining = 1994;
        employee1.address = "DC";

        Employee employee2 = new Employee();
        employee2.employeeName = "Sam";
        employee2.yearOfJoining = 2000;
        employee2.address = "Swargate";

        Employee employee3 = new Employee();
        employee3.employeeName = "John";
        employee3.yearOfJoining = 2002;
        employee3.address = "Warje";

        System.out.println("Name" + "\t" + "Year Of Joining" + "\t" + "Address");
        System.out.println(employee1.employeeName + "\t" + employee1.yearOfJoining + "\t" + employee1.address);
        System.out.println(employee2.employeeName + "\t" + employee2.yearOfJoining + "\t" + employee2.address);
        System.out.println(employee3.employeeName + "\t" + employee3.yearOfJoining + "\t" + employee3.address);

    }
}

class Employee {
    String employeeName;
    int yearOfJoining;
    String address;
}
