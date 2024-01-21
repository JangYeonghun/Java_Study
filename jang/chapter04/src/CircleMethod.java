// 예제 4-1
// 메소드는 외부에서 매개 변수를 통하여 값을 전달할 수 있다. Circle 클래스에 몇 개의 메소드를 추가해보자
/*
실행 결과
원의 반지름: 100
원의 면적: 31400.0
 */

public class CircleMethod {
    int radius; // 반지름

    void setRadius(int r) { // void, 반환형 없음, 매개 변수: 정수 1개, 첫 번째 인스턴스 메소드
        radius = r;
    }

    double calcArea() { // 반환형 double, 매개 변수: 없음, 두 번째 인스턴스 메소드
        return 3.14 * radius * radius;
    }

    void print() { // void 반환형 없음, 매개 변수 없음, 세 번째 인스턴스 메소드
        System.out.println("원의 반지름: " + radius);
        System.out.println("원의 면적: " + calcArea());
    }

    public static void main(String[] args) {
    // public 접근지정자
    // static 정적메소드 즉 객체(인스턴스)에 소속된 멤버가 아니라 클래스에 고정된 멤버(정적 멤버)
    // void 반환형 없음
    // main은 java의 시작점
    // main 메소드의 매개변수인 args를 문자열 배열로 받는다

        CircleMethod obj; // 참조 변수 선언
        obj = new CircleMethod(); // 객체 생성

        obj.setRadius(100);

        obj.print();

    }
}
