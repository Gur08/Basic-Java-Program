package July22;

public class Main {
    public static void main(String[] args) {
        Tesla t1 =new Tesla();
        t1.model = "Model X";
        t1.color ="black";
        t1.price ="60000";
        Tesla.engineType ="Electric";

        Tesla t2 =new Tesla();
        t2.model = "Model y";
        t2.color ="white";
        t2.price ="80000";
        Tesla.engineType ="Electric";

        Tesla t3 =new Tesla();
        t3.model = "Model Z";
        t3.color ="Green";
        t3.price ="90000";
        Tesla.engineType ="Electric";

        t1.makecar();
        t2.makecar();
        t3.makecar();

        // if i call the static variable by object it will show waring so better is call by class name
    }
}
