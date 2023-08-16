package AnonmyusClassAugust15;

public class Bottle {
    static class Water{
        public void color(){
            System.out.println("water has no color");
        }
    }
    static void test(){
        System.out.println();
    }
}
class Main{
    public static void main(String[] args) {
        Bottle.Water water = new Bottle.Water();
        water.color();
        Bottle.test();
    }
}