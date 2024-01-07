import java.util.Scanner;

// 예제 2-6
// 사용자로부터 정수 2개를 받아서 합을 계산하는 코드를 작성해보자
/*
실행 결과:
첫 번째 숫자를 입력하시오: 10
두 번째 숫자를 입력하시오: 20
30
*/
public class Add2 {
    public static void main(String[] args) {
        //               메소드 함수(기능을 수행) ㄱ
        // 클래스명 오브젝트명 = new 클래스명(옵션 및 데이터);
        //                         ㄴ 오브젝트를 생성하는 기능(생성자)
        // String도 이처럼 써야하지만 자주 쓰기에 특별히 그냥 처리한다
        Scanner sc = new Scanner(System.in);
        int num1, num2, sum;

        System.out.print("첫 번째 숫자를 입력하시오: ");
        num1 = sc.nextInt();

        System.out.print("두 번째 숫자를 입력하시오: ");
        num2 = sc.nextInt();

        sum = num1 + num2;

        System.out.println(sum);
    }
}
