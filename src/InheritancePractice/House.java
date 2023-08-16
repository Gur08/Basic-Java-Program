package InheritancePractice;

public class House {
    int noOfbedrooms;
    String garageType;
    String ventilationType;

    public House(String garageType, String ventilationType,int noOfbedrooms) {
        this.noOfbedrooms = noOfbedrooms;
        this.garageType = garageType;
        this.ventilationType = ventilationType;
    }

    public void display(int noOfbedrooms, String garageType, String ventilationType){
    System.out.println("No of Bedrooms : "+ this.noOfbedrooms +"  Garage Type : "+ this.garageType +"  Ventilation Type : "+ this.ventilationType);
}
}
