package com.example.hrtest;

import com.example.hr.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", 1001, 50000.0);
        employee.printName();
        employee.printSalary();
    }
}
