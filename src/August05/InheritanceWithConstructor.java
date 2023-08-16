package  August05;

public class InheritanceWithConstructor {
        //Laptop
        String brandName;
        String processor;

    public InheritanceWithConstructor(String brandName, String processor) {
        this.brandName = brandName;
        this.processor = processor;
    }
}
class Dell extends InheritanceWithConstructor{
    int screenSize;

    public Dell(String brandName, String processor, int screenSize) {
        super(brandName,processor);
        this.screenSize = screenSize;
    }
    public void ShowLaptop(){
        System.out.println("Brand :"+brandName+"Processor : "+processor+"Screen Size : "+screenSize);
    }
}
class LaptopMain{
    public static void main(String[] args) {
        Dell dell =new Dell("HP ","Ryzen 9 ",15);
        dell.ShowLaptop();
    }
}

