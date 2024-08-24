package pack1;

public class first {
    public static long findfact(int number) {
        if (number == 0) {
            return 1;
        } else {
            return number * findfact(number - 1);
        }
    }
}
