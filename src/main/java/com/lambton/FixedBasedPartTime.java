package com.lambton;

public class FixedBasedPartTime extends PartTime{

    private int mFixedAmount;
    public FixedBasedPartTime(String mName , int mAge ) {
        super(mName, mAge);
    }


    public void setRates(int nRate,int nHours,int mFixedAmount){
        this.setRate(nRate);
        this.setHoursWorked(nHours);
        this.mFixedAmount=mFixedAmount;
    }
    public int calcEarning(){

        return ((getRate()*getHoursWorked())+mFixedAmount);
    }

    @Override
    public void printMyData()
    {
        super.printMyData();
        System.out.println("fixed Amount: "+mFixedAmount);
        System.out.println("Earning "+calcEarning()+"+(+" +getTotalHoursEarning ()+"+"+mFixedAmount+")");
    }

    public void setVehicle(int type, String mMake,String mPlate)
    {

        Vehicle mVehicle=VehicleFactory.vehicleType(type,mMake,mPlate);
        setEmployeeVehicle(mVehicle);

    }
}

