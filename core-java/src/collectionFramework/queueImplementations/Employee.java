package collectionFramework.queueImplementations;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee /*implements Comparable<Employee>*/ {
    private int employeeId;
    private String employeeName;
    private int employeeSalary;

   /* @Override
    public int compareTo(Employee employee) {
        return employee.employeeSalary - this.employeeSalary;
    }*/
}
