public class Odd implements Runnable{


    private InterThreadBySemaphore ints = new InterThreadBySemaphore();

    private int max = 0;

    public Odd(InterThreadBySemaphore ts, int i) {

        this.max=i;
        this.ints = ts;
    }

    @Override
    public void run() {

        for(int i= 1; i<max; i+=2) ints.printOddNumber(i);
        
    }
}
