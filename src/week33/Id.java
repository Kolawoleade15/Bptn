package week33;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

class Id {

    // This method finds the biggest integer in the list. 
    // Then increments the integer found by one unit and finally 
    // inserts the new integer incrememented into the list.
	static void insertNextId(List<Integer> list) {

		int max = 0;

		for (int id : list) {
			if (id > max) {
				max = id;
			}
		}
		
		list.add(++max);
		System.out.println("Inserted: " + Thread.currentThread().getName() + ", " + max);
	}
}

class MyThread extends Thread {
    private List<Integer> list;
    public MyThread(String name, List<Integer> list) {
        super(name);
        this.list = list;
    }
    // Create a parameterized constructor.
    @Override
public void run() {
    Id.insertNextId(list);
}
    // Override the run() method here.   


    public static void main(String[] args) throws InterruptedException {

        List<Integer> list = new CopyOnWriteArrayList<>(Arrays.asList(5,1,4,3,6,2));
        MyThread t1 = new MyThread("T1", list);
        MyThread t2 = new MyThread("T2", list);
        // Create a t1 and t2 of MyThread class here.
        t1.start();
        t2.start();
        // Start t1 and t2 threads here
        t1.join();
        t2.join();
        // Run the join() method from t1 and t2 threads here
        System.out.println(list);
        // Print out the list variable here.
    }
}
