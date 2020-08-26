package day39_CustomClass;

public class Employee {
    /*
    Attributes:
    employeeName, gender, SSn, employeeID, JobTitle, Salary
     */

    String name;
    char gender;
    String SSN;
    String jobTitle;
    double salary;
    public void setEmployeeInfo(String employeeName, char employeeGender, String employeeSSn, String employeeJobTitle, double employeeSalary){
        name = employeeName;
        gender = employeeGender;
        SSN = employeeSSn;
        jobTitle = employeeJobTitle;
        salary = employeeSalary;
    }
    public void getEmployeeInfo(){
        System.out.println("Name: " + name + ", Gender " + gender + ", Job title: " + jobTitle + ", Salary: $" + salary);
        String ssn = "" + SSN;
        System.out.println("Last four digits of SSN: " + ssn.substring((ssn.length()-4)));
    }
}
