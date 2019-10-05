package com.lambton;


public class VehicleFactory {

    public static Vehicle vehicleType(int type,String mMake,String mPlate){
        Vehicle vehicle = null;
        switch (type) {
            case 1:
                vehicle = new Motorcycle(mMake,mPlate);
                break;

            case 2:
                vehicle = new Car(mMake,mPlate);
                break;

            default:
                break;
        }
        return vehicle;
    }
}

