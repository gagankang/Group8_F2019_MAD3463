package com.lambton;


public abstract class PartTime extends Employee{

    private int mRate;
    private int mHoursWorked;
    private int mType;



    PartTime(String mName, int mAge ) {
        super(mName,mAge);
    }




    public int getRate()
    {
        return mRate;
    }

    public int getHoursWorked(){
        return mHoursWorked;
    }



    public void setRate(int mRate)
    {
        this.mRate= mRate;
    }


    public void setHoursWorked(int mHoursWorked){
        this.mHoursWorked=mHoursWorked;
    }




    @Override
    public void printMyData() {
        System.out.println("\n");
        super.printMyData();
        if(mType==Constants.TYPE_COMISSION_EMPLOYEE)
        {
            System.out.println("Employee is Parttime/Commissioned");
        }
        else if(mType==Constants.TYPE_FIXED_EMPLOYEE)
        {
            System.out.println("Employee is Parttime/Fixed Amount");
        }
        System.out.println("Rate: "+mRate);
        System.out.println("HoursWorked "+mHoursWorked);

    }

    public  int getTotalHoursEarning ()
    {
        return mRate*mHoursWorked;
    }


}

