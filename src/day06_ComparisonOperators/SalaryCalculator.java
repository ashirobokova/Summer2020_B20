package day06_ComparisonOperators;

public class SalaryCalculator {
    public static void main(String[] args) {
        // Salary:  rate * weeklyHours * 48
        // totalTax: salary * (stateTaxRate + federalTaxRate)
        // salaryAfterTax; salary - totalTax
        double rate = 48.5;
        double stateTaxRate = 0.04;
        double federalTaxRate = 0.2;
        int weeklyHours = 40;

        double salary = rate * weeklyHours * 48;
        System.out.println("Salary before tax: " + salary +" USD");

        double totalTax = salary * (stateTaxRate+federalTaxRate);
        System.out.println("Total Tax: " + totalTax + "USD");

        double salaryAfterTax = salary - totalTax;
        System.out.println("Take home salary: " + salaryAfterTax + "USD");

    }

}
