package week32;


class MyThread extends Thread{
int limitToStop;
public MyThread(int limitToStop) {
    this.limitToStop = limitToStop;
}
    // Create a constructor to initialize the above instance variable
@Override
public void run() {
    for (int i = 0; i <=limitToStop; i++) {
        if (i % 2 == 1) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
    // Override the run() method here.

}

public class Main {

    public static void main(String[] args) {
        MyThread myThread = new MyThread(20);
        // Create a variable from the MyThread class here.
        myThread.start();
        // Start the thread here
    }

}
