package InheritancePractice;

public class DetachedHouse extends House {
    Boolean detached;
    int parkingSpace;

    public DetachedHouse(String garageType, String ventilationType,Boolean detached, int parkingSpace,int noOfbedrooms) {
        super(garageType,ventilationType,noOfbedrooms);
        this.detached = detached;
        this.parkingSpace = parkingSpace;
    }



    public void displayDetachedFeatures(){
        System.out.println("No of Bedrooms : "+noOfbedrooms+"  Garage Type : "+garageType+"  Ventilation Type : "+ventilationType+"  Detached : "+detached+"  Parking spaces : "+parkingSpace);
    }
}
