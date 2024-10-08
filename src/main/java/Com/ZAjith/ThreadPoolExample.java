package Com.ZAjith;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
    public static void main(String[] args) {
        // Create a thread pool with fixed number of threads
        ExecutorService executor = Executors.newFixedThreadPool(5);

        // Submit tasks to the thread pool
        for (int i = 0; i < 10; i++) {
            executor.submit(new Task(i));
        }

        // Shutdown the executor when all tasks are completed
        executor.shutdown();
    }

    static class Task implements Runnable {
        private final int taskId;

        public Task(int id) {
            this.taskId = id;
        }

        @Override
        public void run() {
            System.out.println("Task " + taskId + " is running on thread " + Thread.currentThread().getName());
        }
    }
}

