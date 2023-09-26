package August05;

public class Test {
    int rollNo;
    String name;

    private Test() {
        this.rollNo = rollNo;
        this.name = name;
    }
    public static Test methodstatic(){

        Test test=new Test();

        return test;
    }
}
class TestMain{
    public static void main(String[] args) {
        /*Test test=new Test();
        System.out.println(test);
        Test test1=new Test();
        System.out.println(test1);*/

        System.out.println(Test.methodstatic().name="Gurpreet");
    }
}