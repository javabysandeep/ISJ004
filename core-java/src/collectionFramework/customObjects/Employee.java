package collectionFramework.customObjects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee implements Comparable<Employee> {
    private int employeeId;
    private String employeeName;
    private int employeeSalary;

    @Override
    public int compareTo(Employee employee) {
        //return this.employeeSalary - employee.employeeSalary; // asc salary
//        return employee.employeeSalary - this.employeeSalary; //desc salary
//        return this.employeeName.compareTo(employee.employeeName);//asc name
        return employee.employeeName.compareTo(this.employeeName);//desc name
    }

}
