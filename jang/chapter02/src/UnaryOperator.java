// 예제 2-9
public class UnaryOperator {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;

        int nextx = ++x; // nextx: 2
        int nexty = y++; // nexty: 1

        System.out.println(nextx);
        System.out.println(nexty);

        // 번외
        int n = 10;
        int m = n; // m: 10, n: 10

        m = ++n; // m: 11, n: 11
        System.out.println(m + ", " + n);

        m = n++; // m:11, n: 12
        System.out.println(m + ", " + n);

        m = --n; // m: 11, n: 11
        System.out.println(m + ", " + n);

        m = n--; // m: 11, n: 10
        System.out.println(m + ", " + n);
    }
}
