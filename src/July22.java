public class July22 {
    public int x = 2;
    public String r = "Singh";


}
class Ad{
    public static void main(String[] args) {
        StringBuilder s=new StringBuilder("Singh");
        StringBuilder s1= new StringBuilder("Singh");
        System.out.println(s == s1);
        System.out.println(s.equals(s1));
        System.out.println(s.toString().equals(s1.toString()));
        System.out.println(s.hashCode());
        System.out.println(s.toString());
        July22 july22=new July22();
        System.out.println(july22.toString());

    }
}
