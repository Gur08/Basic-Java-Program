package August05;

public class Aeroplane {
    int wheel;
    int noOfEngines;
    String engineType;

    public void display(){
        System.out.println("No of Wheel : "+wheel);
        System.out.println("No of Engines: "+noOfEngines);
        System.out.println("Engine Type :"+engineType);
    }
}
class FighterPlane extends Aeroplane{
    int noOfpilot;
    String planeType;
    Aeroplane aeroplane=new Aeroplane();
    public void display2(){
        aeroplane.display();
        System.out.println("No of Pilots : "+noOfpilot);
        System.out.println("Plane Type :"+planeType);
    }
}
class AeroplaneMain{
    public static void main(String[] args) {
        FighterPlane fb = new FighterPlane();
        fb.wheel = 3;
        fb.noOfEngines = 4;
        fb.engineType = "Propeller Engine";
        fb.noOfpilot = 1;
        fb.planeType = "Rafale";
        fb.display2();

    }
}