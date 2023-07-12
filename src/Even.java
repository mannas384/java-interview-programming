public class Even implements Runnable{


    private InterThreadBySemaphore ints = new InterThreadBySemaphore();

    private int max = 0;

    public Even(InterThreadBySemaphore ts, int i) {
        this.max=i;
        this.ints = ts;

    }

    @Override
    public void run() {

        for(int i= 2; i<max; i+=2){
            ints.printEvenNumber(i);
        }

    }
}
