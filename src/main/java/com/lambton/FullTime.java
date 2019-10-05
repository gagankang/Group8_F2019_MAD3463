package com.lambton;



public class FullTime extends Employee {

    private int mSalary=0;
    private int mBonus=0;
    public FullTime(String mName, int mAge) {
        super(mName,mAge);

    }

    public void setRates(int mSalary,int mBonus){


        this.mSalary=mSalary;
        this.mBonus=mBonus;
    }
    public int calcEarning(){


        return(mSalary+mBonus);
    }

    @Override
    public void printMyData()
    {

        super.printMyData();
        System.out.println("Earning "+calcEarning());
    }
}

