// 예제 2-12
public class BitOperator {
    public static void main(String[] args) {
        // ~: 비트 NOT
        // &: 비트 AND
        // ^: 비트 XOR
        // |: 비트 OR
        // <<: 비트 왼쪽 이동
        // >>: 비트 오른쪽 이동
        int x = 0x0fff;
        int y = 0xfff0;

        System.out.printf("%x ", (x & y));
        System.out.printf("%x ", (x | y));
        System.out.printf("%x ", (x ^ y));
        System.out.printf("%x ", ~x);
    }
}
