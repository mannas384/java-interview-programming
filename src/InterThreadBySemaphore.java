import java.util.concurrent.Semaphore;

public class InterThreadBySemaphore {

    private Semaphore evensmp = new Semaphore(0);
    private Semaphore oddsmp = new Semaphore(1);

    void printEvenNumber(int num){

        try {
            evensmp.acquire();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println(Thread.currentThread().getName() + num);
        evensmp.release();
    }
    void printOddNumber(int num){

        try {
            oddsmp.acquire();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println(Thread.currentThread().getName() + num);
        oddsmp.release();
    }


    public static void main(String[] args) {

        InterThreadBySemaphore ts = new InterThreadBySemaphore();

        Thread odd = new Thread(new Odd(ts, 10),"Odd");
        Thread even = new Thread(new Even(ts, 10),"Even");
        odd.start();
        even.start();


    }
}
