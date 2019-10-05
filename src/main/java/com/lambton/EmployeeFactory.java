package com.lambton;

public class EmployeeFactory {

    public static Employee employeeType(int type,String nName,int mAge){

        Employee employee = null;
        switch (type) {
            case Constants.TYPE_COMISSION_EMPLOYEE:
                employee = new ComissionBasedPartTime(nName,mAge);
                break;

            case Constants.TYPE_FIXED_EMPLOYEE:
                employee = new FixedBasedPartTime(nName,mAge);
                break;

            case Constants.TYPE_FULLTIME_EMPLOYEE:
                employee = new FullTime(nName,mAge);
                break;
            case Constants.TYPE_INTERN_EMPLOYEE:
                employee = new Intern(nName,mAge);
                break;

            default:

                break;
        }
        return employee;
    }
}
