/**
 * Created by Praktika on 10.11.2016.
 */
public class exercise55 {

    public static void main(String[] args) {
        checkFermat(3, 4, 5, 1);
    }
    public static void checkFermat(int a, int b, int c, int n) {
        if (n > 2 && Math.pow(a,n) + Math.pow(b,n) == Math.pow(c,n)) {
            System.out.println(" Holy smokes, Fermat was wrong!");
            return;
        }
        else {
        System.out.println(" No that doesn't work.");
        }
        System.out.print(n);
        checkFermat(3, 4, 5, n + 1);
    }
}
