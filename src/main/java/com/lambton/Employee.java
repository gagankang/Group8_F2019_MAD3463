package com.lambton;


public abstract class Employee  implements IPrintable{
    private String mName;
    private int mAge;
    private boolean hasVehicle;
    private Vehicle mVehicle;

    Employee(String mName, int mAge)
    {

        this.mName=mName;
        this.mAge=mAge;
    }

    public  int calcBirthYear()
    {

        return 2018-mAge;
    }

    public int calcEarning()
    {

        return 1000;
    }



    public void getVehicle()
    {
        if(!hasVehicle)
        {
            System.out.println("Employee has no vehicle Registered.");
        }
        else
        {
            if(mVehicle!=null)
            {
                mVehicle.printMyData();

            }
        }
    }

    public void  setEmployeeVehicle(Vehicle vehicle)
    {
        hasVehicle=true;
        this.mVehicle=vehicle;
    }


    @Override
    public void printMyData() {
        System.out.println("\n");

        System.out.println("Name: "+mName);
        System.out.println("Year of Birth: "+calcBirthYear());
        getVehicle();
    }
}

