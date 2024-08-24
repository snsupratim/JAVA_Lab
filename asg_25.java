public class asg_25 {
    static class SimpleTask implements Runnable {
        @Override
        public void run() {
            System.out.println("Running task in " + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        // Create a thread with a simple task
        Thread thread = new Thread(new SimpleTask(), "ExampleThread");

        // Start the thread for the first time
        thread.start();

        // Wait for the thread to finish
        try {
            thread.join(); // Wait for the thread to complete
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Attempt to start the same thread again
        try {
            thread.start(); // This will cause an exception
        } catch (IllegalThreadStateException e) {
            System.out.println("Exception caught: " + e);
        }
    }
}