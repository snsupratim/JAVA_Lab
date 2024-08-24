package pack2;

public class second {
    public static long findgcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return findgcd(b, a % b);
        }

    }
}
