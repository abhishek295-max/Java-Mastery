

public class mini_project
{
    public static void main(String args[])
    {
        // Employee Details
        String employeeName = "Abhishek Samadhiya";
        int employeeId = 101;

        // Basic Salary
        double basicSalary = 50000;

        // Allowances
        double hra = basicSalary * 0.20;     // 20%
        double da = basicSalary * 0.10;      // 10%
        double bonus = basicSalary * 0.05;   // 5%

        // Gross Salary
        double grossSalary = basicSalary + hra + da + bonus;

        // Tax
        double tax = grossSalary * 0.10;     // 10%

        // Net Salary
        double netSalary = grossSalary - tax;

        // Salary Slip
        System.out.println("==========================================");
        System.out.println("           EMPLOYEE SALARY SLIP");
        System.out.println("==========================================");
        System.out.println("Employee Name : " + employeeName);
        System.out.println("Employee ID   : " + employeeId);
        System.out.println("------------------------------------------");
        System.out.println("Basic Salary  : ₹" + basicSalary);
        System.out.println("HRA (20%)     : ₹" + hra);
        System.out.println("DA (10%)      : ₹" + da);
        System.out.println("Bonus (5%)    : ₹" + bonus);
        System.out.println("------------------------------------------");
        System.out.println("Gross Salary  : ₹" + grossSalary);
        System.out.println("Tax (10%)     : ₹" + tax);
        System.out.println("------------------------------------------");
        System.out.println("Net Salary    : ₹" + netSalary);
        System.out.println("==========================================");

    }
}
