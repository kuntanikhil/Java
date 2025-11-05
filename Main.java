public class Main {
    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
        for(int i=1;i<=13;i++){
            list.add(i);
        }
        System.out.println(list.getcapacity());
    }
}
