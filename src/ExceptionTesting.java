
public class ExceptionTesting {

    public static void main(String []args){



        int a = getValue();
        System.out.println(a);
        /*try{

            System.out.println("i am not done");
        try{
            int a =10/0;

        }catch(Exception e){
            System.out.println("i am not doe 2");
        }
            System.out.println("i am not done 3");
    }catch(Exception e){
            System.out.println("i a not done 4");
        }
        System.out.println("i am not done 5");*/

    }

    private static int getValue() {
        try{
            int a = 10/0;
            System.out.println("try");
            return 1;
        }catch(Exception e){
            System.out.println("catch");
            return 2;
        }finally {
            System.out.println("finally");
            return 3;
        }
    }
}
