import java.util.Scanner;

// Programming Exercise 2
// 사용자가 입력한 값이 1,2,...9 이면 ONE, TWO,...NINE과 같이 출력하는 프로그램 작성 이외는 OTHER 출력
/*
실행 결과
정수를 입력하세요: 7
SEVEN
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // sc는 오브젝트, new Scanner는 생성자
        int inputNum;
        String result;

        System.out.print("정수를 입력하세요: ");
        inputNum = sc.nextInt(); // sc는 사용된 오브젝트이기에 인스턴스, 뒤에 nextInt는 인스턴스메소드(클래스 뒤는 정적 메소드)

        if (inputNum == 1) {
            result = "ONE";
        } else if (inputNum == 2) {
            result = "TWO";
        } else if (inputNum == 3) {
            result = "THREE";
        } else if (inputNum == 4) {
            result = "FOUR";
        } else if (inputNum == 5) {
            result = "FIVE";
        } else if (inputNum == 6) {
            result = "SIX";
        } else if (inputNum == 7) {
            result = "SEVEN";
        } else if (inputNum == 8) {
            result = "EIGHT";
        } else if (inputNum == 9) {
            result = "NINE";
        } else {
            result = "OTHER";
        }

        System.out.println(result);
    }
}
