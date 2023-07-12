public class MainTest {

    public static void main(String args[]){
        SBI s=new SBI();
        ICICI i=new ICICI();
        System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());
        System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());
    }
}
