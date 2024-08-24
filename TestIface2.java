/**
 * interface
 */
interface Callback {
    void callback(int param);
}

class Client implements Callback {
    public void callback(int p) {
        System.out.println(p);
    }
}

class AnotherClient implements Callback {
    public void callback(int p) {
        System.out.println("another");
        System.out.println(p * p);
    }
}

class TestIface2 {
    public static void main(String[] args) {
        Callback c = new Client();
        AnotherClient ob = new AnotherClient();

        c.callback(42);
        c = ob;
        c.callback(42);

    }
}
