package Day04_Variables;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class Variables3 {
    public static void main(String[] args) {

        // school name: Cybertek School
        String employeeName = "Peter";
        String employeeID = "B1234";
        String jobTitle = "SDET";
        double salary = 120_000.50;
        char geneder = 'F';
        boolean isFullTime = true;

        System.out.println("Employee Name is " + employeeName);
        System.out.println("Employee ID is " + employeeID);
        System.out.println("JobTitle is " + jobTitle);
        System.out.println("Salary is " + salary + " USD");
        System.out.println("Geneder: "+ geneder);
        System.out.println(isFullTime);

    }



}
