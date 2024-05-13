package practice;

public class Main {

    public static void main(String[] args) {
    // Develop a Java program that demonstrates thread synchronization using lambda expressions. Create mutiple threads that increment a shared counter concurrently, and use synchronization mechanisms with lambda expressions.
    // Create a shared counter
        Counter counter = new Counter();
        // Create 10 threads that increment the counter concurrently
        Runnable runnable = () -> {
            for (int i = 0; i < 10000; i++) {
                counter.increment();
                }
        };
        Thread[] threads = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(runnable);
            threads[i].start();
        }
        // Wait for all threads to finish
        for (int i = 0; i < 10; i++)
        {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                }
        }
        // Print the final value of the counter
        System.out.println("Counter value: " + counter.getValue());

    }
}
