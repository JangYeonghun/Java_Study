// Programming Exercise 6
// 2 와 100 사이에 있는 모든 소수를 찾아라.
/*
실행 결과
2부터 100사이 모든 소수 : 2 3 5 7 11 13 17 ...
 */
public class PrimeNumber {
    public static void main(String[] args) {
        System.out.print("2부터 100사이 모든 소수: ");
        for (int i = 2; i < 100; i++) {
            for (int j = 3; j <= i; j++) {
                if (i % (j-1) == 0) {
                    break;
                } else if (i == j) {
                    System.out.print(" " + i);
                }
            }
        }
    }
}
