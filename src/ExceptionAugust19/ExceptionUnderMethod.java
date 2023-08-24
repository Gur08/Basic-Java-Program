package ExceptionAugust19;

class Student{
    public void setName(){
       String name = "Pragra";
        name=null;
        name.trim();
    }
    public void callName(){
        setName();
    }
}
public class ExceptionUnderMethod {
    public static void main(String[] args) {
        Student student=new Student();
        student.callName();
    }
}

// As we run we can see the exception hierarchy
