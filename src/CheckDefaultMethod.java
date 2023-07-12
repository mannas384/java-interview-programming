public class CheckDefaultMethod implements InterfaceB,IterfaceA{
    @Override
    public int getValue(int a) {
        return a;
    }



    public static void main(String[] args) {
        CheckDefaultMethod cd = new CheckDefaultMethod();
        int a = cd.getValue(10);
        System.out.println(a);
    }


}
