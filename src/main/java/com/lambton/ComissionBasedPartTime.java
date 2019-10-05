package com.lambton;

public class ComissionBasedPartTime extends PartTime {

    private int mComissionPerc;
    public ComissionBasedPartTime(String mName, int mAge) {
        super(mName, mAge);
    }

    public void setRates(int nRate,int nHours,int mCommission){
        this.setRate(nRate);
        this.setHoursWorked(nHours);
        this.mComissionPerc=mCommission;
    }

    public int calcEarning(){
    return (getTotalHoursEarning ())+((mComissionPerc*getTotalHoursEarning())/100);
    }

    @Override
    public void printMyData()
    {

        super.printMyData();
        System.out.println("Commission: "+mComissionPerc+"%");
        System.out.println("Earning "+calcEarning()+"("+mComissionPerc+"% of "+getTotalHoursEarning ()+")");
    }

    public void setVehicle(int type, String mMake,String mPlate)
    {


        Vehicle mVehicle=VehicleFactory.vehicleType(1,mMake,mPlate);
        setEmployeeVehicle(mVehicle);

    }


}

