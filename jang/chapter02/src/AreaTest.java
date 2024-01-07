// 예제 2-2
// 반지름이 5.0인 원의 면적을 계산하는 프로그램을 작성해 보자. 모든 변수를 실수형으로 정의하라
// 실행 결과: 반지름이 5인 원의 면적은 78.5398
public class AreaTest {
    public static void main(String[] args) {
        final double PI = 3.141592;
        double distance = 5.0;

        double area = PI * distance * distance;

        System.out.println("반지름이 5인 원의 면적은 " + area);
    }
}
