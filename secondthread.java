class newthread implements Runnable {
    Thread t;

    newthread() {
        t = new Thread(this, "demo child");
        System.out.println("child thread:" + t);
    }

    public void run() {
        try {
            for (int i = 5; i >= 0; i--) {
                System.out.println("child thread:" + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("child interrupted");
        }
        System.out.println("exiting child thread");
    }
}

public class secondthread {
    public static void main(String[] args) {
        newthread nt = new newthread();
        nt.t.start();

        try {
            for (int i = 5; i >= 0; i--) {
                System.out.println("main thread:" + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("main interrupted");
        }

        System.out.println("main nthread exited");

    }

}
