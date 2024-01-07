// 예제 2-4
// 두개의 문자열을 + 연산자로 합쳐보자.
// 실행 결과: Hello World! \n I'm a new Java programmer!
public class StringTest {
    public static void main(String[] args) {
        // 자바에서 문자열(string)은 문자들의 모임인데 자료형이 아니라 클래스이다
        // String은 바이트 차이가 심해서 int, float 처럼 고정을 못시킨다(변동)
        String s1 = "Hello World";
        String s2 = "I'm a new Java programmer!";

        System.out.println(s1 + "\n" + s2);
    }
}
