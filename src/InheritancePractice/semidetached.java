package InheritancePractice;

public class semidetached {
    String noOfBathrooms;
    Boolean basementFurnished;

    public semidetached(String noOfBathrooms, Boolean basementFurnished) {
        this.noOfBathrooms = noOfBathrooms;
        this.basementFurnished = basementFurnished;
    }

    public void display2(){
        System.out.println("No of Bathrooms : "+noOfBathrooms+"Basement is Furnished :"+basementFurnished);
    }
}
