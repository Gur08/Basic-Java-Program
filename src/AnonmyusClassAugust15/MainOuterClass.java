package AnonmyusClassAugust15;

public class MainOuterClass {
    // inner outer class concept
    public static void main(String[] args) {
        OuterClass outerClass=new OuterClass();
        outerClass.name="Mike";
        outerClass.outsidemethod();

        // to access the inner class we have to create the object of outer class
        //to access the inner class we have to refer the outer class
        // OuterClassName.InnerClassname obj =outerClassObject.new innerClassName
        OuterClass.Inclass innerclass =outerClass.new Inclass();
        System.out.println(innerclass.x = 20);
        System.out.println(innerclass.x);
        innerclass.insidemethod();
    }
}
