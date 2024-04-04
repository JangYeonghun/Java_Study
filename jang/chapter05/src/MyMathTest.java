// 예제 5-2
// 간단한 연산을 제공하는 MyMath 클래스를 작성해 보자
// MyMath 클래스는 n^k 값을 계산하는 power() 함수와 절대값 함수를 제공한다
// 모두 정적 메소드로 정의해보자

class MyMath {
    // 접근지정자 public(동일클래스, 동일패키지, 자식클래스, 전체세계), 정적 메소드(클래스 멤버 메소드), 매개변수 int x int k, return 값 int
    public static int abs(int x) {
        return x > 0 ? x : -x;
    }

    public static int power(int x, int k) {
        int result = 1;

        for (int i = 0; i < k; i++) {
            result *= x;
        }

        return result;
    }
}

public class MyMathTest {
    public static void main(String[] args) {
        // 정적 변수/메서드는 class에 의해 실행, 접근이 가능하다 (인스턴스 변수/메서드는 object에 의해 실행, 접근이 가능하다)
        int exam = MyMath.abs(-2);
        System.out.println(exam);
        System.out.println("10의 3승은 " + MyMath.power(10, 3));
    }
}

