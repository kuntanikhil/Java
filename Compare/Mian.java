package Compare;

public class Mian {
    public static void main(String[] args) {
        CompareEX a = new CompareEX(12,45);
        CompareEX b = new CompareEX(13,57);
        if(a.compareTo(b)<0){
            System.out.println(a.compareTo(b));
            System.out.println("b is greater");
        }else{
            System.out.println(a.compareTo(b));
            System.out.println("a is greater");
        }
    }
}
