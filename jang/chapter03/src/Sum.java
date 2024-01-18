// 예제 3-109
// 1부터 10까지의 정수를 더하여 합을 구하는 프로그램 작성
/*
실행 결과
1부터 10까지의 정수의 합 = 55
 */
public class Sum {
    public static void main(String[] args) {
        int sum = 0;

        for(int i = 10; i > 0; i--) {
            sum += i;
        }
        System.out.println("1부터 10까지의 정수의 합 = " + sum);
    }
}
