package durgasoft.ConcurrentCollections;

import java.util.HashMap;
import java.util.Map;

public class HashMapFailExample {
    public static void main(String[] args) throws InterruptedException {
        Map<Integer, Integer> map = new HashMap<>();
        
        Runnable task = () -> {
            for (int i = 0; i < 10000; i++) {
                map.put(i, i);
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        // Expected size: 10000 (each key should be unique)
        // Actual size: May be < 10000 due to overwritten or lost entries
        System.out.println("Expected map size: 10000");
        System.out.println("Actual map size: " + map.size());
    }
    
    
}
