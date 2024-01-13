// Programming Exercise 1
// 1부터 100 사이의 정수 중에서 3 또는 4의 배수의 합을 계산하는 프로그램을 작성
/*
실행 결과
3 또는 4의 배수의 합=2551
 */
public class Test2 {
    public static void main(String[] args) {
        int sum = 0;

        for(int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                sum += i;
            } else if (i % 4 == 0) {
                sum += i;
            }
        }

        System.out.println("3 또는 4의 배수의 합=" + sum);
    }
}
