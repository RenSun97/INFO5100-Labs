/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> employees;

    public EmployeeDirectory() {
        employees = new ArrayList();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employees;
    }
    
    public Employee createEmployee(String name){
        Employee employee = new Employee();
        employee.setName(name);
        employees.add(employee);
        return employee;
    }
}