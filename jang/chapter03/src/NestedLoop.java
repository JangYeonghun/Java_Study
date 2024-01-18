// 예제 3-13
// 중첩 반복문으로 *(10개, 5개)기호를 사각형 모양으로 출력하라
/*
실행 결과
**********
**********
**********
**********
**********
 */
public class NestedLoop {
    public static void main(String[] args) {

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        // 중첩 반복문으로 구구단을 2단부터 9단까지 출력해보자
        for(int k = 2; k <= 9; k++) {
            for(int m = 1; m <= 9; m++) {
                System.out.println(k + " * " + m + " = " + k * m);
            }
        }

        // 가로로 해보기
        for(int n = 1; n <= 9; n++) {
            for(int h = 2; h <= 9; h++) {
                System.out.printf("%2d * %1d = %2d  ", h, n, h * n);
            }
            System.out.println("");
        }

    }
}
