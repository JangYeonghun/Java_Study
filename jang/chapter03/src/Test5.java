// Programming Exercise 5
// 1차 방정식 3x + 10y = 100 을 만족하는 모든 해를 구하는 프로그램 작성 x와 y는 정수이고, 0 <= x <= 10, 0 <= y <= 10 으로 가정
/*
실행 결과
(0,10)
(10,7)
 */
public class Test5 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                if (3 * i + 10 * j == 100) {
                    System.out.println("(" + i + "," + j + ")");
                }
            }
        }
    }
}
