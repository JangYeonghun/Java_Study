// Programming exercise 7
// 피타고라스 a^2 + b^2 = c^2 각 변의 길이가 100보다 작은 삼각형 중에서 피타고라스의 정리가 성립하는 직각 삼각형은 몇개나 있을까?
// 3중 반복문 이용, 피타고라스의 정리를 만족하는 3개의 정수를 찾도록 하자
/*
실행 결과
3 4 5
4 3 5
5 12 13
...
 */
public class Test6 {
    public static void main(String[] args) {

        for (int a = 1; a < 100; a++) {
            for (int b = 1; b < 100; b++) {
                for (int c = 1; c < 100; c++) {
                    if (a * a + b * b == c * c) {
                        System.out.println(a + " " + b + " " + c);
                    }
                }
            }
        }
    }
}
