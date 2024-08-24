public class asg_24 {
    // Define a class that implements Runnable
    static class NumberPrinter implements Runnable {
        private final String threadName;

        public NumberPrinter(String threadName) {
            this.threadName = threadName;
        }

        @Override
        public void run() {
            for (int i = 1; i <= 10; i++) {
                System.out.println(threadName + ": " + i);
            }
        }
    }

    public static void main(String[] args) {
        // Run the program 5 times
        for (int run = 1; run <= 5; run++) {
            System.out.println("\nRun " + run);

            // Create threads
            Thread thread1 = new Thread(new NumberPrinter("Thread1"));
            Thread thread2 = new Thread(new NumberPrinter("Threaxd2"));
            Thread thread3 = new Thread(new NumberPrinter("Thread3"));

            // Start threads
            thread1.start();
            thread2.start();
            thread3.start();

            // Wait for threads to finish
            try {
                thread1.join();
                thread2.join();
                thread3.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}