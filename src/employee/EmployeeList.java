package employee;

import java.util.LinkedList;

public class EmployeeList<T> extends LinkedList<Employee> implements Cloneable {

    public EmployeeList() {
    }

    public EmployeeList(EmployeeList<Employee> employeeList) {
        EmployeeList<Employee> clonedList = new EmployeeList<>();
        for(Employee employee : employeeList) {
            Employee newEmployee = new Employee(employee.getName(), employee.getSalary());
            clonedList.add(newEmployee);
        }
        super.addAll(clonedList);
    }


@Override
public EmployeeList clone() {
    return new EmployeeList(this);
}

}