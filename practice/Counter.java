package practice;

public class Counter {
    private int value;

    public synchronized void increment() {
        value++;
    }   

    public int getValue() {
        return this.value;
    }

    
}
