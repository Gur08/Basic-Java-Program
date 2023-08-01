package July29;

public class StringMethodsPractice {
   private int id=101; //instance variable
     private String name="Mike";
    private String Username="Mike256";
  private  String Password="Mike652";

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

//    public void setId(String UserName){ // local variable
//      this.Username =UserName;
//  }

}
/*
access modifier
Private
Public
protected
default

this --- refeer to the current class object/instance variable
*/
class Main{
    public static void main(String[] args) {
        StringMethodsPractice sc =new StringMethodsPractice();
        sc.setId(102);
        System.out.println(sc.getId());


    }

}

// boiler plate code