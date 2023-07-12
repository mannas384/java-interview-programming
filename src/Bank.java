public class Bank {

    int getRateOfInterest(){
        try{
            int a =10/0;
        }catch(Exception e){
            throw new RuntimeException("hello");
        }

        return 0;}
}
