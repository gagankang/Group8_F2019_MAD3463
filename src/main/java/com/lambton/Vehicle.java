

package com.lambton;



public abstract  class Vehicle implements IPrintable {

    private String mMake;
    private String mPlate;

    public Vehicle(String mMake,String mPlate)
    {
        this.mMake=mMake;
        this.mPlate=mPlate;
    }




    public String getMake()
    {
        return mMake;
    }


    public String getmPlate(){
        return mPlate;
    }


    @Override
    public void printMyData() {

        System.out.println("Make: " + mMake);
        System.out.println("Plate: " + mPlate);

    }
}

