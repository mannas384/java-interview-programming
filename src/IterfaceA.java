@FunctionalInterface
public interface IterfaceA {
    public int getValue(int a);

    default String getName(String name){
       return name;
    }

}
