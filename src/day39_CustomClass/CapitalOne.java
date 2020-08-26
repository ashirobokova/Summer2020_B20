package day39_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CapitalOne {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        Employee employee4 = new Employee();
        Employee employee5 = new Employee();

        employee1.setEmployeeInfo("Roman", 'M', "123477477","QA", 150000);
        employee2.setEmployeeInfo("Alena", 'F', "1234567", "SDET", 150000 );
        employee3.setEmployeeInfo("Roman", 'M', "123477477","QA", 150000);
        employee4.setEmployeeInfo("Roman", 'M', "123477477","QA", 150000);
        employee5.setEmployeeInfo("Roman", 'M', "123477477","QA", 150000);

        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.addAll(Arrays.asList(employee1, employee2, employee3, employee4, employee5));

        double max = Integer.MIN_VALUE;
        String name = "";
        for(Employee each : employeeList){
            double eachSalary = each.salary;

            if(eachSalary > max){
                max = eachSalary;
                name = each.name;
            }
        }
        System.out.println("Maximum Salary: " + max);
        System.out.println("Name: " + name);
    }

}
