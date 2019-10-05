package com.lambton;
public class PayrollApplication {
    public static void main(String[] args) {

        Employee e1 = EmployeeFactory.employeeType(Constants.TYPE_COMISSION_EMPLOYEE, "Shiji", 22);
        ((ComissionBasedPartTime) e1).setVehicle(1, "Bullet", "RJ-14-CD-2001");
        ((ComissionBasedPartTime) e1).setRates(10, 20, 10);
        System.out.println("\n");
        Employee e2 = EmployeeFactory.employeeType(Constants.TYPE_FIXED_EMPLOYEE, "Gagan", 24);
        ((FixedBasedPartTime) e2).setVehicle(2, "Swift", "RJ-19-Cb-0062");
        ((FixedBasedPartTime) e2).setRates(20, 20, 20);
        System.out.println("\n");

        Employee e3 = EmployeeFactory.employeeType(Constants.TYPE_FULLTIME_EMPLOYEE, "Rajdeep", 23);
        ((FullTime) e3).setRates(2000, 400);
        System.out.println("\n");

        Employee e4 = EmployeeFactory.employeeType(Constants.TYPE_INTERN_EMPLOYEE, "Rajdeep Mittra", 25);
        e1.printMyData();
        e2.printMyData();
        e3.printMyData();
        ((Intern) e4).setSchoolName("Lambton College");
        e4.printMyData();
        System.out.println("\n");

        System.out.println("Total Earning---" + (e1.calcEarning() + e2.calcEarning() + e3.calcEarning() + e4.calcEarning()));

    }

}

