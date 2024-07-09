package com.solutions;

/*
 * 6. Avoiding deadlocks
 * Program where a resource can be accessed by more than one thread, without encountering a deadlock.
 * To avoid deadlocks
 * you are required to procure resources in a certain order and ensure that they are released in reverse order.
 */
public class AvoidingDeadlocks {

	public static void main(String[] args) {
		
		  Resource resourceA = new Resource("ResourceA");
	        Resource resourceB = new Resource("ResourceB");

	        Thread thread1 = new Thread(new Worker(resourceA, resourceB), "Thread-1");
	        Thread thread2 = new Thread(new Worker(resourceB, resourceA), "Thread-2");

	        thread1.start();
	        thread2.start();

	        try {
	            thread1.join();
	            thread2.join();
	        } catch (InterruptedException e) {
	            Thread.currentThread().interrupt();
	        }
	}

}

class Resource {
    private final String name;

    public Resource(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Worker implements Runnable {
    private final Resource resource1;
    private final Resource resource2;

    public Worker(Resource resource1, Resource resource2) {
        this.resource1 = resource1;
        this.resource2 = resource2;
    }

    @Override
    public void run() {
        synchronized (resource1) {
            System.out.println(Thread.currentThread().getName() + " acquired " + resource1.getName());

            try {
                Thread.sleep(100); // Simulate some work with resource1
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            synchronized (resource2) {
                System.out.println(Thread.currentThread().getName() + " acquired " + resource2.getName());

                try {
                    Thread.sleep(100); // Simulate some work with resource2
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
}
